package com.elaq.test;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
public class HMAC {

  public static void main(String[] args) throws Exception {
    System.out.println("The encrypted data using hmac================"+hmacDigest("The quick brown fox jumps over the lazy dog", "key", "HmacSHA1"));
  }
  @Override
  public String toString()
  {
	  return null;
  }

  public static String hmacDigest(String msg, String keyString, String algo) {
    String digest = null;
    try {
      SecretKeySpec key = new SecretKeySpec((keyString).getBytes("UTF-8"), algo);
      Mac mac = Mac.getInstance(algo);
      mac.init(key);
      KeyGenerator keyGen = KeyGenerator.getInstance("AES");
      keyGen.init(256); // for example
      SecretKey secretKey = keyGen.generateKey();
      System.out.println("#######################"+secretKey.toString());
      byte[] bytes = mac.doFinal(msg.getBytes("ASCII"));

      StringBuffer hash = new StringBuffer();
      for (int i = 0; i < bytes.length; i++) {
        String hex = Integer.toHexString(0xFF & bytes[i]);
        if (hex.length() == 1) {
          hash.append('0');
        }
        hash.append(hex);
      }
      digest = hash.toString();
    } catch (UnsupportedEncodingException e) {
    } catch (InvalidKeyException e) {
    } catch (NoSuchAlgorithmException e) {
    }
    return digest;
  }
}