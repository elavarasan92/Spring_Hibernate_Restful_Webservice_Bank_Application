package com.bank.loancalculator;

import java.util.ArrayList;
import java.util.List;

import com.bank.loancalculator.pojo.EMI;


public class LoanCalculator {

	double emi;
	
	double totalInterest;
	double totalPayableAmount;
	List<EMI> emiList = new ArrayList<EMI>();
	
	public double calcEmi(double p,int n,double r)
	{
		r = r/(12*100);
		emi=(p*r*(Math.pow((1+r), n)))/(Math.pow((1+r), n)-1);
		return emi;
		
	}

	public double emiCalc(double principal,int noOfInstallments,double rate)
	{

		emi=Math.round(calcEmi(principal,noOfInstallments,rate));
		totalInterest = Math.round((emi*noOfInstallments)-principal);
		totalPayableAmount = principal+totalInterest;
//		System.out.println("Principal-------------------------------"+principal);
//		System.out.println("No of Installments----------------------"+noOfInstallments);
//		System.out.println("Rate of Interest------------------------"+rate);
//		System.out.println("Total emi-------------------------------"+emi);
//		System.out.println("Total interest--------------------------"+totalInterest);
//		System.out.println("Total amount payable including interest-"+totalPayableAmount);
//	
		
		for(int i=1;i<=noOfInstallments;i++)
		{
	
			double ratePerMonth = rate/(12*100);
			double principalOfMonth=Math.round(emi-(ratePerMonth*principal));
			double balanceOfPrincipal =Math.round(principal-principalOfMonth);
			double interestPerMonth = Math.round(ratePerMonth*principal);
			EMI emi = new EMI();
			emi.setPrincipalOfMonth(principalOfMonth);
			emi.setInterestPerMonth(interestPerMonth);
			emi.setBalanceOfPrincipal(balanceOfPrincipal);
			
//		System.out.println("No of Month#######################################-------"+i);
//		//System.out.println("Total EMI of this month----------"+Math.round(emi));
//		System.out.println("Interest of the Month-----"+interestPerMonth);
//		System.out.println("Principal of the Month----"+principalOfMonth);
//		System.out.println("Balance of principal-------"+balanceOfPrincipal);
//		System.out.println("##################################################--------");
		emiList.add(emi);
		System.out.println("List of payments"+emiList);
		principal=balanceOfPrincipal;
		
		}
		
		return emi;
	}
	

	public static void main(String [] args)
	{
		LoanCalculator obj = new LoanCalculator();
		
		
		
		obj.emiCalc(5000,5,10);

	}
}
