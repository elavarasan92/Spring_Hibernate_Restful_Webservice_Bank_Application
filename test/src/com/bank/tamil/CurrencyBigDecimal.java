package com.bank.tamil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyBigDecimal {

	public static void main(String[] args)
	{
		BigDecimal modelVal = new BigDecimal("24.455");
		BigDecimal displayVal = modelVal.setScale(2, RoundingMode.HALF_EVEN);
		NumberFormat usdCostFormat = NumberFormat.getCurrencyInstance(Locale.US);
		usdCostFormat.setCurrency("$");
		usdCostFormat.setGroupingUsed(',');
		usdCostFormat.setMonetaryDecimalSeparator(',');
		df.setMaximumFractionDigits(0);
		System.out.println( usdCostFormat.format(displayVal.doubleValue()) );
	}
}
