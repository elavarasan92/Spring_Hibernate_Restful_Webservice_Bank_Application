package com.elaq.test;

import java.sql.Date;

public class PaymentsBean {

	private int id;
	private String transferType;
	private String fromAccount;
	private String toAccount;
	private double amount;
	private String currency;
	private Date requestedDate;
	private String creditDbitFlag;
	private String fromAccountType;
	private String toAccountType;
	private String impsChannelType;
	private String impsTranType;
	private String ifscCode;
	private String description;
	private String customerID;
	private String customerName;
	private String fromMMID;
	private String fromMobileNo;
	private String toMMID;
	private String toMobileNo;
	private String beneficiaryName;
	private String paymentType;
	private String beneficiaryAddress1;
	private String beneficiaryAddress2;
	private String beneficiaryAddress3;
	private Date scheduledDate;
	private boolean isRepeated;
	private boolean paymentProcessed;
	private String referenceId;
	private String username;
	private boolean isActive;

	private String transDate;
	private String transReferenceId;
	private long tranAmount;
	private String cifId;
	private String remitterAccount;
	private String benAccountNo;
	private String benName;
	private String benIFSCCode;
	private String benBankName;
	private String benDetails;
	private String transRefNo;
	private String transAmount;
	private String transStatus;
	private double balanceAmt4Transfer;
	private int holidayYear;
	private Date holidayDate;
	private String transactionType;
	private int paymentSummaryStartIndex;
	private int paymentSummaryEndIndex;
	private int interval;
	private int stopAfter;
	private double newMaxAmount;
	private boolean isValidInput = true;
	private String narration;
	private String clientIP;
	private String freeField;
	private boolean isDefaultTransferType;
	
	
	private boolean isDailyLimitAvailable;
	private boolean isUserLimitAvailable;
	private boolean isBankLimitAvailable;
	private boolean isTodaysTransferDetailsAvailable;
	
	private double todaysTotalTransferredAmt;
	private int todaysTotalTransactionCount;
	private double todaysTotalTransferTypeAmt;
	private int todaysTotalTransferTypeCount;
	
	private double minDailyTransferAmt;
	private double maxDailyTransferAmt;
	private int maxDailyTransferCount;
	private double minTransferTypeAmt;
	private double maxTransferTypeAmt;
	private int maxTransferTypeCount;
	
	private String appId;
	private String appTranId;
	private String impsTranId;
	private long impsTransactionId;
	private String tranParticular;
	private String nbin;
	private String impsRrn;
	
	private String status;
	private int err_code;
	private String err_msg;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getRequestedDate() {
		return requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		this.requestedDate = requestedDate;
	}

	public String getCreditDbitFlag() {
		return creditDbitFlag;
	}

	public void setCreditDbitFlag(String creditDbitFlag) {
		this.creditDbitFlag = creditDbitFlag;
	}

	public String getFromAccountType() {
		return fromAccountType;
	}

	public void setFromAccountType(String fromAccountType) {
		this.fromAccountType = fromAccountType;
	}

	public String getToAccountType() {
		return toAccountType;
	}

	public void setToAccountType(String toAccountType) {
		this.toAccountType = toAccountType;
	}

	public String getImpsChannelType() {
		return impsChannelType;
	}

	public void setImpsChannelType(String impsChannelType) {
		this.impsChannelType = impsChannelType;
	}

	public String getImpsTranType() {
		return impsTranType;
	}

	public void setImpsTranType(String impsTranType) {
		this.impsTranType = impsTranType;
	}

	

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getCifId() {
		return cifId;
	}

	public void setCifId(String cifId) {
		this.cifId = cifId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getFromMMID() {
		return fromMMID;
	}

	public void setFromMMID(String fromMMID) {
		this.fromMMID = fromMMID;
	}

	public String getFromMobileNo() {
		return fromMobileNo;
	}

	public void setFromMobileNo(String fromMobileNo) {
		this.fromMobileNo = fromMobileNo;
	}

	public String getToMMID() {
		return toMMID;
	}

	public void setToMMID(String toMMID) {
		this.toMMID = toMMID;
	}

	public String getToMobileNo() {
		return toMobileNo;
	}

	public void setToMobileNo(String toMobileNo) {
		this.toMobileNo = toMobileNo;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	

	

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getBeneficiaryAddress1() {
		return beneficiaryAddress1;
	}

	public void setBeneficiaryAddress1(String beneficiaryAddress1) {
		this.beneficiaryAddress1 = beneficiaryAddress1;
	}

	public String getBeneficiaryAddress2() {
		return beneficiaryAddress2;
	}

	public void setBeneficiaryAddress2(String beneficiaryAddress2) {
		this.beneficiaryAddress2 = beneficiaryAddress2;
	}

	public String getBeneficiaryAddress3() {
		return beneficiaryAddress3;
	}

	public void setBeneficiaryAddress3(String beneficiaryAddress3) {
		this.beneficiaryAddress3 = beneficiaryAddress3;
	}

	public Date getScheduledDate() {
		return scheduledDate;
	}

	public void setScheduledDate(Date scheduledDate) {
		this.scheduledDate = scheduledDate;
	}

	public boolean isRepeated() {
		return isRepeated;
	}

	public void setRepeated(boolean isRepeated) {
		this.isRepeated = isRepeated;
	}

	public boolean isPaymentProcessed() {
		return paymentProcessed;
	}

	public void setPaymentProcessed(boolean paymentProcessed) {
		this.paymentProcessed = paymentProcessed;
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getInterval() {
		return interval;
	}

	public void setInterval(int interval) {
		this.interval = interval;
	}

	public int getStopAfter() {
		return stopAfter;
	}

	public void setStopAfter(int stopAfter) {
		this.stopAfter = stopAfter;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getErr_code() {
		return err_code;
	}

	public void setErr_code(int err_code) {
		this.err_code = err_code;
	}

	public String getErr_msg() {
		return err_msg;
	}

	public void setErr_msg(String err_msg) {
		this.err_msg = err_msg;
	}

	public String getTransDate() {
		return transDate;
	}

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

	public String getTransReferenceId() {
		return transReferenceId;
	}

	public void setTransReferenceId(String transReferenceId) {
		this.transReferenceId = transReferenceId;
	}

	

	public String getRemitterAccount() {
		return remitterAccount;
	}

	public void setRemitterAccount(String remitterAccount) {
		this.remitterAccount = remitterAccount;
	}

	public String getBenAccountNo() {
		return benAccountNo;
	}

	public void setBenAccountNo(String benAccountNo) {
		this.benAccountNo = benAccountNo;
	}

	public String getBenName() {
		return benName;
	}

	public void setBenName(String benName) {
		this.benName = benName;
	}

	public String getBenIFSCCode() {
		return benIFSCCode;
	}

	public void setBenIFSCCode(String benIFSCCode) {
		this.benIFSCCode = benIFSCCode;
	}

	public String getBenBankName() {
		return benBankName;
	}

	public void setBenBankName(String benBankName) {
		this.benBankName = benBankName;
	}

	public String getBenDetails() {
		return benDetails;
	}

	public void setBenDetails(String benDetails) {
		this.benDetails = benDetails;
	}

	public String getTransRefNo() {
		return transRefNo;
	}

	public void setTransRefNo(String transRefNo) {
		this.transRefNo = transRefNo;
	}

	public String getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

	public String getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}

	public double getBalanceAmt4Transfer() {
		return balanceAmt4Transfer;
	}

	public void setBalanceAmt4Transfer(double balanceAmt4Transfer) {
		this.balanceAmt4Transfer = balanceAmt4Transfer;
	}

	public int getHolidayYear() {
		return holidayYear;
	}

	public void setHolidayYear(int holidayYear) {
		this.holidayYear = holidayYear;
	}

	

	public Date getHolidayDate() {
		return holidayDate;
	}

	public void setHolidayDate(Date holidayDate) {
		this.holidayDate = holidayDate;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public int getPaymentSummaryStartIndex() {
		return paymentSummaryStartIndex;
	}

	public void setPaymentSummaryStartIndex(int paymentSummaryStartIndex) {
		this.paymentSummaryStartIndex = paymentSummaryStartIndex;
	}

	public int getPaymentSummaryEndIndex() {
		return paymentSummaryEndIndex;
	}

	public void setPaymentSummaryEndIndex(int paymentSummaryEndIndex) {
		this.paymentSummaryEndIndex = paymentSummaryEndIndex;
	}

	public double getNewMaxAmount() {
		return newMaxAmount;
	}

	public void setNewMaxAmount(double newMaxAmount) {
		this.newMaxAmount = newMaxAmount;
	}

	public boolean isValidInput() {
		return isValidInput;
	}

	public void setValidInput(boolean isValidInput) {
		this.isValidInput = isValidInput;
	}

	

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public double getTodaysTotalTransferredAmt() {
		return todaysTotalTransferredAmt;
	}

	public void setTodaysTotalTransferredAmt(double todaysTotalTransferredAmt) {
		this.todaysTotalTransferredAmt = todaysTotalTransferredAmt;
	}

	public int getTodaysTotalTransactionCount() {
		return todaysTotalTransactionCount;
	}

	

	public double getMinDailyTransferAmt() {
		return minDailyTransferAmt;
	}

	public void setMinDailyTransferAmt(double minDailyTransferAmt) {
		this.minDailyTransferAmt = minDailyTransferAmt;
	}

	public double getMaxDailyTransferAmt() {
		return maxDailyTransferAmt;
	}

	public void setMaxDailyTransferAmt(double maxDailyTransferAmt) {
		this.maxDailyTransferAmt = maxDailyTransferAmt;
	}

	public int getMaxDailyTransferCount() {
		return maxDailyTransferCount;
	}

	

	public double getMinTransferTypeAmt() {
		return minTransferTypeAmt;
	}

	public void setMinTransferTypeAmt(double minTransferTypeAmt) {
		this.minTransferTypeAmt = minTransferTypeAmt;
	}

	public double getMaxTransferTypeAmt() {
		return maxTransferTypeAmt;
	}

	public void setMaxTransferTypeAmt(double maxTransferTypeAmt) {
		this.maxTransferTypeAmt = maxTransferTypeAmt;
	}

	public int getMaxTransferTypeCount() {
		return maxTransferTypeCount;
	}

	public double getTodaysTotalTransferTypeAmt() {
		return todaysTotalTransferTypeAmt;
	}

	public void setTodaysTotalTransferTypeAmt(double todaysTotalTransferTypeAmt) {
		this.todaysTotalTransferTypeAmt = todaysTotalTransferTypeAmt;
	}

	public int getTodaysTotalTransferTypeCount() {
		return todaysTotalTransferTypeCount;
	}

	public void setTodaysTotalTransferTypeCount(int todaysTotalTransferTypeCount) {
		this.todaysTotalTransferTypeCount = todaysTotalTransferTypeCount;
	}

	public void setTodaysTotalTransactionCount(int todaysTotalTransactionCount) {
		this.todaysTotalTransactionCount = todaysTotalTransactionCount;
	}

	

	

	public void setMaxDailyTransferCount(int maxDailyTransferCount) {
		this.maxDailyTransferCount = maxDailyTransferCount;
	}

	public void setMaxTransferTypeCount(int maxTransferTypeCount) {
		this.maxTransferTypeCount = maxTransferTypeCount;
	}

	public boolean isDailyLimitAvailable() {
		return isDailyLimitAvailable;
	}

	public void setDailyLimitAvailable(boolean isDailyLimitAvailable) {
		this.isDailyLimitAvailable = isDailyLimitAvailable;
	}

	public boolean isUserLimitAvailable() {
		return isUserLimitAvailable;
	}

	public void setUserLimitAvailable(boolean isUserLimitAvailable) {
		this.isUserLimitAvailable = isUserLimitAvailable;
	}

	public boolean isTodaysTransferDetailsAvailable() {
		return isTodaysTransferDetailsAvailable;
	}

	public void setTodaysTransferDetailsAvailable(
			boolean isTodaysTransferDetailsAvailable) {
		this.isTodaysTransferDetailsAvailable = isTodaysTransferDetailsAvailable;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppTranId() {
		return appTranId;
	}

	public void setAppTranId(String appTranId) {
		this.appTranId = appTranId;
	}

	public String getImpsTranId() {
		return impsTranId;
	}

	public void setImpsTranId(String impsTranId) {
		this.impsTranId = impsTranId;
	}

	public String getTranParticular() {
		return tranParticular;
	}

	public void setTranParticular(String tranParticular) {
		this.tranParticular = tranParticular;
	}

	public String getNbin() {
		return nbin;
	}

	public void setNbin(String nbin) {
		this.nbin = nbin;
	}

	public String getImpsRrn() {
		return impsRrn;
	}

	public void setImpsRrn(String impsRrn) {
		this.impsRrn = impsRrn;
	}

	public String getClientIP() {
		return clientIP;
	}

	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
	}

	public String getFreeField() {
		return freeField;
	}

	public void setFreeField(String freeField) {
		this.freeField = freeField;
	}

	public long getTranAmount() {
		return tranAmount;
	}

	public void setTranAmount(long tranAmount) {
		this.tranAmount = tranAmount;
	}

	public long getImpsTransactionId() {
		return impsTransactionId;
	}

	public void setImpsTransactionId(long impsTransactionId) {
		this.impsTransactionId = impsTransactionId;
	}

	public boolean isBankLimitAvailable() {
		return isBankLimitAvailable;
	}

	public void setBankLimitAvailable(boolean isBankLimitAvailable) {
		this.isBankLimitAvailable = isBankLimitAvailable;
	}

	public boolean isDefaultTransferType() {
		return isDefaultTransferType;
	}

	public void setDefaultTransferType(boolean isDefaultTransferType) {
		this.isDefaultTransferType = isDefaultTransferType;
	}

	

	

	

}
