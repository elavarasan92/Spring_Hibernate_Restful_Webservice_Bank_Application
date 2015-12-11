package com.bank.tamil;

import java.util.Currency;
import java.util.Locale;

public class CurrencySymbol {
	
	public static void main(String[] args)
	{
	
	Locale enGBLocale = 
		    new Locale.Builder().setLanguage("en").setRegion("GB").build();

		Locale enUSLocale =
		    new Locale.Builder().setLanguage("en").setRegion("US").build();

		Currency currencyInstance = Currency.getInstance(enUSLocale);

		System.out.println(
		    "Symbol for US Dollar, en-US locale: " +
		    currencyInstance.getSymbol(enUSLocale));

		System.out.println(
		    "Symbol for US Dollar, en-UK locale: " +
		    currencyInstance.getSymbol(enGBLocale));
	}
}
