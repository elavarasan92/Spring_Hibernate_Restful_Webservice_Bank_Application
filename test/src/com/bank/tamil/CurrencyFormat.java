package com.bank.tamil;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

public class CurrencyFormat {
	
	public static void main(String [] args)
	{
		NumberFormat df = NumberFormat.getCurrencyInstance();
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setCurrencySymbol("$");
		dfs.setGroupingSeparator(',');
		dfs.setMonetaryDecimalSeparator(',');
		df.setMaximumFractionDigits(0);
		((DecimalFormat) df).setDecimalFormatSymbols(dfs);
		System.out.println(df.format(3333454));
	}

}
