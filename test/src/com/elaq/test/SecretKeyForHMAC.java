package com.elaq.test;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Base64;
public class SecretKeyForHMAC {
	
	public static void main(String []args) throws NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException
	{
		  Cipher cipher = Cipher.getInstance("RSA/NONE/PKCS1Padding", "BC");
	// create new key
	SecretKey secretKey = KeyGenerator.getInstance("HMACSHA256").generateKey();
	System.out.println("Plain Secret Key---------"+secretKey);
	// get base64 encoded version of the key
	String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
	System.out.println("encoded Secret Key####################"+encodedKey);
	
	// decode the base64 encoded string
	byte[] decodedKey = Base64.getDecoder().decode(encodedKey);
	// rebuild key using SecretKeySpec
	SecretKey originalKey = new SecretKeySpec(decodedKey, 0, decodedKey.length, "HMACSHA256"); 
	System.out.println("Original key#############"+originalKey);
	}
}
