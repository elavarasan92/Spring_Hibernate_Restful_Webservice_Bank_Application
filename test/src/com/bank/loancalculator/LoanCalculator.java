package com.bank.loancalculator;

import java.math.BigDecimal;

public class LoanCalculator {
	
	public int count=1;
	public double emi;

	public double emiCalc(double principal,int noOfInstallments,double rate)
	{
		if(count==1)
		{
		double r = rate/(12*100);
		double emi=(principal*r*(Math.pow((1+r), noOfInstallments)))/(Math.pow((1+r), noOfInstallments)-1);
		System.out.println("EMI-----"+Math.round(emi));
		System.out.println("Interest---"+Math.round(r*principal));
		System.out.println("Principal----"+Math.round(emi-(r*principal)));
		System.out.println("###################################"+count);
		count++;
		
		}
		else if(count>1)
		{
			for(int i=2;i<=noOfInstallments;i++)
			{
				double r = rate/(12*100);
				double emi=(principal*r*(Math.pow((1+r), noOfInstallments)))/(Math.pow((1+r), noOfInstallments)-1);
				System.out.println("EMI-----"+Math.round(emi));
				System.out.println("Interest---"+Math.round(r*principal));
				System.out.println("Principal----"+Math.round(emi-(r*principal)));
				System.out.println("###################################"+count);
				count++;
				
			}
		}
		return emi;
	}
	
//	public double emiCalc(double rate)
//	{
//		double r = (rate/12)*100);
//	//	BigDecimal emi=principal*rate*(Math.pow(a, b))
//		System.out.println(r);
//		return r;
//	
//		
//	}

	public static void main(String [] args)
	{
		LoanCalculator obj = new LoanCalculator();
		
		obj.emiCalc(5000,5,10);
//		double r= 10;
//		double month = 12;
//		double rate = r/(12*100);
//		System.out.println(rate);
	}
}
