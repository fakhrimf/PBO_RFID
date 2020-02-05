package utils;


import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.*;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Base64;
import models.UserModel;

import static utils.Constants.*;

/**
 * @author Raden Gilang S and Fakhri MF
 */
public class PasswordUtils {
    private static SecretKeySpec secretKey;
    Connection con;
    private String DB_Parent = "Guru";
    private String DB_Username = "username";
    private String DB_Password = "password";
    FirebaseConnection konek;

    public boolean login(String username, char[] password) throws FileNotFoundException, IOException {
   //     con = SQLiteConnection.connect(DB_NAME);
        final String secretKey = PASSWORD_KEY;
        String originalPass = String.valueOf(password);
        String encryptedString = PasswordUtils.encrypt(originalPass, secretKey);
        boolean isRight = false;
       
        FileInputStream serviceAccount =
          new FileInputStream("src\\main\\db\\kumascanner-firebase-adminsdk-m3epa-2ab5b27c8f.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
          .setCredentials(GoogleCredentials.fromStream(serviceAccount))
          .setDatabaseUrl("https://kumascanner.firebaseio.com")
          .build();

        FirebaseApp.initializeApp(options);
        
        final DatabaseReference rootRef = FirebaseDatabase.getInstance()
            .getReference("restricted_access/secret_document");
        rootRef.addListenerForSingleValueEvent(new ValueEventListener() {
          
          @Override
          public void onDataChange(DataSnapshot dataSnapshot) {
          
            Object document = dataSnapshot.getValue();
            System.out.println(document);
            
            if(dataSnapshot.child(DB_Parent).child(username).exists()){
    
                UserModel users = dataSnapshot.child(DB_Parent).child(username).getValue(UserModel.class);
                
                if(users.getUsername().equals(username) && users.getPassword().equals(originalPass)){
                    final boolean isRight = true;
                }
            }
          }

          @Override
          public void onCancelled(DatabaseError error) {
          }

        });
    
//        Statement stmt;
//        try {
//            stmt = con.createStatement();
//            String query = "SELECT * FROM t_user WHERE username='" + username + "' AND password='" + encryptedString
//                    + "'";
//            ResultSet rs = stmt.executeQuery(query);
//            if(rs.next() && encryptedString != null) {
//                isRight = username.equals(rs.getString(USERNAME_DB_FIELD)) && encryptedString.equals(rs.getString(PASSWORD_DB_FIELD));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return isRight;
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
