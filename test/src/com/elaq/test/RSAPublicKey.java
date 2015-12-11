package com.elaq.test;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


public class RSAPublicKey {
	//byte[] publicKeyBytes;
	String pubKeyStr;
	PublicKey pubKey2;
	String privKeyStr;
	public void getPublicKeyEncoder() throws NoSuchAlgorithmException, InvalidKeySpecException
	{
//		KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
//		kpg.initialize(1024);
//		KeyPair kp = kpg.genKeyPair();
//		Key publicKey = kp.getPublic();
//		Key privateKey = kp.getPrivate();
////		System.out.println("publicKey"+publicKey);
////		System.out.println("privateKey"+privateKey);
//		
//		KeyFactory fact = KeyFactory.getInstance("RSA");
//		RSAPublicKeySpec pub = fact.getKeySpec(kp.getPublic(),RSAPublicKeySpec.class);
//		RSAPrivateKeySpec priv = fact.getKeySpec(kp.getPrivate(),RSAPrivateKeySpec.class);
//		
//		System.out.println("pub-----modulus -"+pub);
//		System.out.println("pub-----getPublicExponent -"+pub.getPublicExponent());
//		
//		System.out.println("priv-----modulus -"+priv.getModulus());
//		System.out.println("priv-----getprivateExponent -"+priv.getPrivateExponent());
		
		
		KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        BASE64Encoder b64 = new BASE64Encoder();

        generator.initialize(1024);

        KeyPair pair = generator.generateKeyPair();
        Key pubKey = pair.getPublic();
        Key privKey = pair.getPrivate();
        pubKeyStr =b64.encode(pubKey.getEncoded());
        privKeyStr = b64.encode(privKey.getEncoded());

        System.out.println("publicKey : " + b64.encode(pubKey.getEncoded()));
        System.out.println("privateKey : " + b64.encode(privKey.getEncoded()));
	}
	public void getPublicKeyDecoder() throws IOException, NoSuchAlgorithmException, InvalidKeySpecException
	{
		
		BASE64Decoder decoder = new BASE64Decoder();
		byte[] sigBytes2 = decoder.decodeBuffer(pubKeyStr);



		// Convert the public key bytes into a PublicKey object
		X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(sigBytes2);
		KeyFactory keyFact = KeyFactory.getInstance("RSA");
		pubKey2 = keyFact.generatePublic(x509KeySpec);
	}
	
	public void saveToFile(String fileName,
			  String pubKey) throws IOException {
			  ObjectOutputStream oout = new ObjectOutputStream(
			    new BufferedOutputStream(new FileOutputStream(fileName)));
			  try {
			    oout.writeObject(pubKey);
			    
			  } catch (Exception e) {
			    throw new IOException("Unexpected error", e);
			  } finally {
			    oout.close();
			  }
			}

	public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException
	{
		RSAPublicKey rSAPublicKey = new RSAPublicKey();
		rSAPublicKey.getPublicKeyEncoder();
		//rSAPublicKey.saveToFile(fileName, pubKey);
	
	
	}
}
