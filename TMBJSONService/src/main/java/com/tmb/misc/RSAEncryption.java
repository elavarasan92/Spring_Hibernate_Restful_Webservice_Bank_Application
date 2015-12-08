//package com.tmb.misc;
//
//import java.io.IOException;
//import java.security.InvalidKeyException;
//import java.security.Key;
//import java.security.KeyFactory;
//import java.security.KeyPair;
//import java.security.KeyPairGenerator;
//import java.security.NoSuchAlgorithmException;
//import java.security.PrivateKey;
//import java.security.PublicKey;
//import java.security.spec.InvalidKeySpecException;
//import java.security.spec.X509EncodedKeySpec;
//
//import javax.crypto.BadPaddingException;
//import javax.crypto.Cipher;
//import javax.crypto.IllegalBlockSizeException;
//import javax.crypto.NoSuchPaddingException;
//
//import sun.misc.BASE64Decoder;
//import sun.misc.BASE64Encoder;
//
//public class RSAEncryption {
//	PublicKey pubKey2;
//	PrivateKey privKey2;
//	Key pubKey;
//	Key privKey;
//	public String getRSAPublicKey() throws NoSuchAlgorithmException {
//		
//		KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
//        BASE64Encoder b64 = new BASE64Encoder();
//
//        generator.initialize(1024);
//
//        KeyPair pair = generator.generateKeyPair();
//        pubKey = pair.getPublic();
//        privKey = pair.getPrivate();
//        String pubKeyStr =b64.encode(pubKey.getEncoded());
////
////        System.out.println("#######################################################################publicKey : " + b64.encode(pubKey.getEncoded()));
////        System.out.println("privateKey : " + b64.encode(privKey.getEncoded()));
////	
//	return pubKeyStr;
//}
//	public PublicKey getPublicKeyDecoder() throws NoSuchAlgorithmException, IOException, InvalidKeySpecException
//	{
//		
//		BASE64Decoder decoder = new BASE64Decoder();
//		byte[] sigBytes2 = decoder.decodeBuffer(getRSAPublicKey());
//
//		// Convert the public key bytes into a PublicKey object
//		X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(sigBytes2);
//		KeyFactory keyFact = KeyFactory.getInstance("RSA");
//		pubKey2 = keyFact.generatePublic(x509KeySpec);
//		return pubKey2;
//	}
//	
//	public PrivateKey getPrivateKeyDecoder() throws NoSuchAlgorithmException, IOException, InvalidKeySpecException
//	{
//		
//		BASE64Decoder decoder = new BASE64Decoder();
//		byte[] sigBytes2 = decoder.decodeBuffer(getRSAPublicKey());
//
//		// Convert the public key bytes into a PublicKey object
//		X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(sigBytes2);
//		KeyFactory keyFact = KeyFactory.getInstance("RSA");
//		pubKey2 = keyFact.generatePublic(x509KeySpec);
//		return pubKey2;
//	}
//	public byte[] encrypt(PublicKey key, byte[] plaintext) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException 
//	{
//	    Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA1AndMGF1Padding");   
//	    cipher.init(Cipher.ENCRYPT_MODE, key);  
//	    return cipher.doFinal(plaintext);
//	}
//	
//	public byte[] decrypt(PrivateKey key, byte[] ciphertext) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException
//	{
//	    Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA1AndMGF1Padding");   
//	    cipher.init(Cipher.DECRYPT_MODE, key);  
//	    return cipher.doFinal(ciphertext);
//	}
//	public static void main(String []args)
//	{
//		RSAEncryption rSAEncryption = new RSAEncryption();
//		rSAEncryption.encrypt(rSAEncryption.getPublicKeyDecoder(), "hello".getBytes());
//		rSAEncryption.decrypt(key, ciphertext);
//	}
//
//}
