package utils;

import javax.crypto.*;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Random;

import static utils.Constants.PASSWORD_INSTANCE;

/**
 * @author Raden Gilang S and Fakhri MF
 */
public class PasswordUtils {
    public byte[] encrypt(char[] password) {
        PBEKeySpec pbeKeySpec = new PBEKeySpec(password);
        SecretKeyFactory secretKeyFactory = null;
        try {
            secretKeyFactory = SecretKeyFactory.getInstance(PASSWORD_INSTANCE);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        SecretKey secretKey = null;
        try {
            if (secretKeyFactory != null) {
                secretKey = secretKeyFactory.generateSecret(pbeKeySpec);
            }
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }

        byte[] salt = new byte[8];
        Random random = new Random();
        random.nextBytes(salt);

        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(salt, 100);
        Cipher cipher = null;
        try {
            cipher = Cipher.getInstance(PASSWORD_INSTANCE);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            e.printStackTrace();
        }
        try {
            if (cipher != null) {
                cipher.init(Cipher.ENCRYPT_MODE, secretKey, pbeParameterSpec);
            }
        } catch (InvalidKeyException | InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }

        byte[] output = new byte[0];
        try {
            if (cipher != null) {
                output = cipher.doFinal();
            }
        } catch (IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
        }
        return output;
    }

    public String decrypt(byte[] encryptedPassword) {
        PBEKeySpec pbeKeySpec = new PBEKeySpec(Arrays.toString(encryptedPassword).toCharArray());
        SecretKeyFactory secretKeyFactory;
        SecretKey secretKey = null;
        try {
            secretKeyFactory = SecretKeyFactory.getInstance(PASSWORD_INSTANCE);
            if (secretKeyFactory != null) {
                secretKey = secretKeyFactory.generateSecret(pbeKeySpec);
            }
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
        byte[] salt = new byte[8];

        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(salt, 100);

        Cipher cipher = null;
        try {
            cipher = Cipher.getInstance("PBEWithMD5AndTripleDES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey, pbeParameterSpec);
        } catch (NoSuchAlgorithmException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchPaddingException e) {
            e.printStackTrace();
        }

        byte[] output = new byte[0];
        try {
            if (cipher != null) {
                output = cipher.doFinal();
            }
        } catch (IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
        }
        return new String(output);
    }

    public byte[] convert(char[] password) {
        return String.valueOf(password).getBytes();
    }

    public String deconvert(byte[] password) {
        return new String(password);
    }
}
