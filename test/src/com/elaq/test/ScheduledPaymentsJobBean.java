package com.indusind.adminmobile.beans;

import java.sql.Date;

public class ScheduledPaymentsJobBean {


	private int jobId;
	
	private Date transferDate;
	
	private String status;
	
	private int errorCode;
	
	private String errorMessage;
	
	//private Date executedDate;
	
	private int noOfAttempts;
	
	private boolean isActive;
	
	private int scheduledPaymentId;
	
	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public Date getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getNoOfAttempts() {
		return noOfAttempts;
	}

	public void setNoOfAttempts(int noOfAttempts) {
		this.noOfAttempts = noOfAttempts;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getScheduledPaymentId() {
		return scheduledPaymentId;
	}

	public void setScheduledPaymentId(int scheduledPaymentId) {
		this.scheduledPaymentId = scheduledPaymentId;
	}

}
