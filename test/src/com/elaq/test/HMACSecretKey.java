package com.elaq.test;

import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class HMACSecretKey {
	String encodedKey;
	SecretKey originalKey;
	// SecretKey to String:
	
	public void hMACsecretKeyToString() throws NoSuchAlgorithmException {
		// create new key
		SecretKey secretKey = KeyGenerator.getInstance("HMACSHA1").generateKey();
		// get base64 encoded version of the key
		encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
		System.out.println("encodedKey----------------------------------"+encodedKey);
	}

	// String to SecretKey:
	public void stringToSecretKey() {
	// decode the base64 encoded string
	byte[] decodedKey = Base64.getDecoder().decode(encodedKey);
	// rebuild key using SecretKeySpec
	originalKey = new SecretKeySpec(decodedKey, 0, decodedKey.length,"HMACSHA1");
	}
	public static void main(String[] argv) throws Exception {

		// Generate a key for the HMAC-SHA1 keyed-hashing algorithm
		KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA1");
		SecretKey key = keyGen.generateKey();
		System.out.println(key);
		HMACSecretKey hMACSecretKey = new HMACSecretKey();
		hMACSecretKey.hMACsecretKeyToString();
	}
}
