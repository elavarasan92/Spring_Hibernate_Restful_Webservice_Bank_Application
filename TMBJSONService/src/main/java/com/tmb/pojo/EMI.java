package com.tmb.pojo;

public class EMI {
	
	private double principalOfMonth;
	private double interestPerMonth;
	private double balanceOfPrincipal;
	
	public double getPrincipalOfMonth() {
		return principalOfMonth;
	}
	public void setPrincipalOfMonth(double principalOfMonth) {
		this.principalOfMonth = principalOfMonth;
	}
	public double getInterestPerMonth() {
		return interestPerMonth;
	}
	public void setInterestPerMonth(double interestPerMonth) {
		this.interestPerMonth = interestPerMonth;
	}
	public double getBalanceOfPrincipal() {
		return balanceOfPrincipal;
	}
	public void setBalanceOfPrincipal(double balanceOfPrincipal) {
		this.balanceOfPrincipal = balanceOfPrincipal;
	}
	
	@Override
	public String toString() {
		return "EMI [principalOfMonth=" + principalOfMonth
				+ ", interestPerMonth=" + interestPerMonth
				+ ", balanceOfPrincipal=" + balanceOfPrincipal + "]";
	}
}