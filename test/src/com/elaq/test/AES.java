package com.elaq.test;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class AES {
    public static String encrypt(String key1, String initializationVector, String value) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initializationVector.getBytes("UTF-8"));

            SecretKeySpec skeySpec = new SecretKeySpec(key1.getBytes("UTF-8"),
                    "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
            byte[] encrypted = cipher.doFinal(value.getBytes());
            System.out.println("encrypted string:"
                    + Base64.encodeBase64String(encrypted));
            return Base64.encodeBase64String(encrypted);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static String decrypt(String key1, String initializationVector, String encrypted) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initializationVector.getBytes("UTF-8"));

            SecretKeySpec skeySpec = new SecretKeySpec(key1.getBytes("UTF-8"),
                    "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
            byte[] original = cipher.doFinal(Base64.decodeBase64(encrypted));

            System.out.println("Decrypted data"+new String(original));
            return new String(original);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

        String key1 = "Bar12345Bar12345"; // 128 bit key
        String initializationVector = "ThisIsASecretKet";
        System.out.println(decrypt(key1, initializationVector,
                encrypt(key1, initializationVector, "Hello World")));
    }
}