package com.tmb.utility;

import java.util.ArrayList;
import java.util.List;

import com.tmb.pojo.EMI;

public class Utility {

	static double  emi;
	static double totalInterest;
	static double totalPayableAmount;
	static List<EMI> emiList = new ArrayList<EMI>();
	
	public static CurrentDate getCurrentDate()
	{
		
	}
	
	public static double calcEmi(double p,int n,double r)
	{
		r = r/(12*100);
		emi=(p*r*(Math.pow((1+r), n)))/(Math.pow((1+r), n)-1);
		return emi;
		
	}

	public static  List<EMI> emiCalc(double principal,int noOfInstallments,double rate)
	{

		emi=Math.round(calcEmi(principal,noOfInstallments,rate));
		totalInterest = Math.round((emi*noOfInstallments)-principal);
		totalPayableAmount = principal+totalInterest;
		emiList.removeAll(emiList);
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

		emiList.add(emi);
		System.out.println("List of payments"+emiList);
		principal=balanceOfPrincipal;
		
		}
		
		return emiList;
	}
}
