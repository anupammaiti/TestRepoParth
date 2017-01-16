package main;

import net.webservicex.ConversionRate;
import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;

public class CurrencyConverterMain {

	public static void main(String[] args) {
		ConversionRate cr=new ConversionRate();
		CurrencyConvertor cc=new CurrencyConvertor();
		
		double crr=cc.getCurrencyConvertorSoap().conversionRate(Currency.USD,Currency.INR);
		
		System.out.println(crr);

	}

}
