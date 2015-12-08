package com.tmb.model;

import java.math.BigDecimal;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.tmb.enumeration.AccountType;

@Entity
@Table(name="accountDetails",uniqueConstraints=@UniqueConstraint(columnNames={"accountNumber"}))
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AccountDetails {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String accountHolderName;
	
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	
	private String accountNumber;
	private String iFSCCode;
	private String bankBranchName;
	private String bankBranchAddress;
	private BigDecimal balance;
	private String userid;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getiFSCCode() {
		return iFSCCode;
	}
	public void setiFSCCode(String iFSCCode) {
		this.iFSCCode = iFSCCode;
	}
	public String getBankBranchName() {
		return bankBranchName;
	}
	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}
	public String getBankBranchAddress() {
		return bankBranchAddress;
	}
	public void setBankBranchAddress(String bankBranchAddress) {
		this.bankBranchAddress = bankBranchAddress;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "AccountDetails [id=" + id + ", accountHolderName="
				+ accountHolderName + ", accountType=" + accountType
				+ ", accountNumber=" + accountNumber + ", iFSCCode=" + iFSCCode
				+ ", bankBranchName=" + bankBranchName + ", bankBranchAddress="
				+ bankBranchAddress + ", balance=" + balance + ", userid="
				+ userid + "]";
	}
	
	
	

}
