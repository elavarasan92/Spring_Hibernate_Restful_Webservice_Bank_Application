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
@Table(name="payeeAccountDetails",uniqueConstraints=@UniqueConstraint(columnNames={"payeeAccountNumber"}))
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PayeeAccountDetails {
  
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;	
	private String payeeAccountName;
	private String payeeNickName;
	
	@Enumerated(EnumType.STRING)
	private AccountType payeeAccountType;
	private String payeeAccountNumber;
	private String payeeBankIFSCCode;
	private String payeeBankName;
	private BigDecimal payeeBalance;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPayeeAccountName() {
		return payeeAccountName;
	}
	public void setPayeeAccountName(String payeeAccountName) {
		this.payeeAccountName = payeeAccountName;
	}
	public String getPayeeNickName() {
		return payeeNickName;
	}
	public void setPayeeNickName(String payeeNickName) {
		this.payeeNickName = payeeNickName;
	}
	public AccountType getPayeeAccountType() {
		return payeeAccountType;
	}
	public void setPayeeAccountType(AccountType payeeAccountType) {
		this.payeeAccountType = payeeAccountType;
	}
	public String getPayeeAccountNumber() {
		return payeeAccountNumber;
	}
	public void setPayeeAccountNumber(String payeeAccountNumber) {
		this.payeeAccountNumber = payeeAccountNumber;
	}
	public String getPayeeBankIFSCCode() {
		return payeeBankIFSCCode;
	}
	public void setPayeeBankIFSCCode(String payeeBankIFSCCode) {
		this.payeeBankIFSCCode = payeeBankIFSCCode;
	}
	public BigDecimal getPayeeBalance() {
		return payeeBalance;
	}
	public void setPayeeBalance(BigDecimal payeeBalance) {
		this.payeeBalance = payeeBalance;
	}
	public String getPayeeBankName() {
		return payeeBankName;
	}
	public void setPayeeBankName(String payeeBankName) {
		this.payeeBankName = payeeBankName;
	}
	
	
}
