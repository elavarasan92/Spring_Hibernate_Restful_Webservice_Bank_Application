package com.tmb.model;

public class RSAPublicKeyBean {
	
	private	String pubKeyStr;

	public RSAPublicKeyBean(String pubKeyStr)
	{
		this.pubKeyStr = pubKeyStr;
	}
	public String getPubKeyStr() {
		return pubKeyStr;
	}

	public void setPubKeyStr(String pubKeyStr) {
		this.pubKeyStr = pubKeyStr;
	}
	
}