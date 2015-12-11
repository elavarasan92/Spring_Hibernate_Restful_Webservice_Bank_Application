 	package com.cryptography.rsa;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


public class RSAEncryptionDecryption {


	
		PublicKey pubKey2;
		PrivateKey privKey2;
		Key pubKey;
		Key privKey;
		String encodedKey;
		RSABean rSABean = new RSABean();
		
		public String hMACsecretKeyToString() throws NoSuchAlgorithmException {
			// create new key
			SecretKey secretKey = KeyGenerator.getInstance("HMACSHA1").generateKey();
			// get base64 encoded version of the key
			encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
			System.out.println("encodedKey----------------------------------"+encodedKey);
			return encodedKey;
		}
		public RSABean getRSAPublicAndPrivateKey() throws NoSuchAlgorithmException {
			
			KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
	        BASE64Encoder b64 = new BASE64Encoder();

	        generator.initialize(2048);

	        KeyPair pair = generator.generateKeyPair();
	        pubKey = pair.getPublic();
	        privKey = pair.getPrivate();
	        
	        String pubKeyStr =b64.encode(pubKey.getEncoded());
	        String privKeyStr = b64.encode(privKey.getEncoded());
	        
	        
	        rSABean.setPubKey(pubKeyStr);
	        rSABean.setPrivKey(privKeyStr);
	
		return rSABean;
	}
		public PublicKey getPublicKeyDecoder() throws NoSuchAlgorithmException, IOException, InvalidKeySpecException
		{
			
			BASE64Decoder decoder = new BASE64Decoder();
			byte[] sigBytes2 = decoder.decodeBuffer(rSABean.getPubKey());

			// Convert the public key bytes into a PublicKey object
			X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(sigBytes2);
			KeyFactory keyFact = KeyFactory.getInstance("RSA");
			pubKey2 = keyFact.generatePublic(x509KeySpec);
			return pubKey2;
		}
		
		public PrivateKey getPrivateKeyDecoder() throws NoSuchAlgorithmException, IOException, InvalidKeySpecException
		{
			
			BASE64Decoder decoder = new BASE64Decoder();
			byte[] sigBytes2 = decoder.decodeBuffer(rSABean.getPrivKey());

			// Convert the public key bytes into a PublicKey object
			PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(sigBytes2);
			KeyFactory keyFact = KeyFactory.getInstance("RSA");
			privKey2 = keyFact.generatePrivate(pKCS8EncodedKeySpec);
			return privKey2;
		}
		public byte[] encrypt(PublicKey key, byte[] plaintext) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException 
		{
		    Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA1AndMGF1Padding");   
		    cipher.init(Cipher.ENCRYPT_MODE, key);
		    System.out.println("cipher text----------------------------------------------------------------"+cipher.doFinal(plaintext));
		    return cipher.doFinal(plaintext);
		}
		
		public byte[] decrypt(PrivateKey key, byte[] ciphertext) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException
		{
		    Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA1AndMGF1Padding");   
		    cipher.init(Cipher.DECRYPT_MODE, key);  
		    System.out.println("decrypted text------------------------------------------------------------------"+cipher.doFinal(ciphertext));
		  
		    return cipher.doFinal(ciphertext);
		}
		public static void main(String []args) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeySpecException, IOException
		{
			RSAEncryptionDecryption rSAEncryptionDecryption = new RSAEncryptionDecryption();
			
			rSAEncryptionDecryption.getRSAPublicAndPrivateKey();
			byte[] ciphertext = rSAEncryptionDecryption.encrypt(rSAEncryptionDecryption.getPublicKeyDecoder(), rSAEncryptionDecryption.hMACsecretKeyToString().getBytes("UTF-8"));
			byte [] decryptedByteArray =rSAEncryptionDecryption.decrypt(rSAEncryptionDecryption.getPrivateKeyDecoder(), ciphertext);
			 String decoded = new String(decryptedByteArray, "UTF-8");
			    System.out.println("decoded:" + decoded);

//			    byte[] encoded = decoded.getBytes("ISO-8859-1"); 
//			    System.out.println("encoded:" + java.util.Arrays.toString(encoded));
//
//			    String decryptedText = encrypter.decrypt(encoded);
		}

	}

