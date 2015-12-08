package com.tmb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint; 



@Entity
@Table(name="BankDetails",uniqueConstraints=@UniqueConstraint(columnNames={"IFSCCode"}))
public class BankDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long hId;
	public long gethId() {
		return hId;
	}
	public void sethId(long hId) {
		this.hId = hId;
	}

	private String id;
	private String bankName;
	private String iFSCCode;
	private String mICRCode;
	private String branchName;
	private String branchAddress;
	private String contactNumber;
	private String city;
	private String district;
	private String state;
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getmICRCode() {
		return mICRCode;
	}
	public void setmICRCode(String mICRCode) {
		this.mICRCode = mICRCode;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getiFSCCode() {
		return iFSCCode;
	}
	public void setiFSCCode(String iFSCCode) {
		this.iFSCCode = iFSCCode;
	}
	
	@Override
	public String toString()
	{
		return  "id------"+id+"------bankName----"+bankName+"-----IFSCCode--------"+iFSCCode+"---------mICRCode------"+mICRCode+"------branchName--------"+branchName+"-----branchAddress-----"+branchAddress+"-----contactNumber----"+contactNumber+"----city----"+city+"------district-------"+district+"-----state----"+state;
		
		
	}
	
	

}
