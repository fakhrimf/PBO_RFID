package utils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Base64;

import static utils.Constants.*;

/**
 * @author Raden Gilang S and Fakhri MF
 */
public class PasswordUtils {
    private static SecretKeySpec secretKey;
    Connection con;

    public boolean login(String username, char[] password) {
        con = SQLiteConnection.connect(DB_NAME);
        final String secretKey = PASSWORD_KEY;
        String originalPass = String.valueOf(password);
        String encryptedString = PasswordUtils.encrypt(originalPass, secretKey);
        boolean isRight = false;

        Statement stmt;
        try {
            stmt = con.createStatement();
            String query = "SELECT * FROM t_user WHERE username='" + username + "' AND password='" + encryptedString
                    + "'";
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next() && encryptedString != null) {
                isRight = username.equals(rs.getString(USERNAME_DB_FIELD)) && encryptedString.equals(rs.getString(PASSWORD_DB_FIELD));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isRight;
    }

    public static void setKey(String myKey) {
        MessageDigest sha = null;
        try {
            byte[] key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, "AES");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static String encrypt(String strToEncrypt, String secret) {
        try {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }

    public static String decrypt(String strToDecrypt, String secret) {
        try {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }
}
