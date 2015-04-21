package com.tokmak.example.money;

import com.tokmak.example.money.Money.CurrencyEnum;

/**
 * <b>Project MoneyExampleProject</b><br />
 * MoneyMain.java<br />
 *
 * <b>created at</b> Apr 21, 2015 10:32:54 PM
 * @author Volkan Tokmak
 * @since 1.00.0
 */
public class MoneyMain
{

	/**
	 * MoneyMain<br />
	 *
	 * @param args
	 * 
	 * <b>created at</b> Apr 21, 2015 10:32:52 PM
	 * @since 1.00.0
	 * @author Volkan Tokmak
	 */
	public static void main(String[] args)
	{
		Money euro 	= new Money(67.89, CurrencyEnum.EURO);
		Money usd	= new Money(98.76, CurrencyEnum.USD);
		
		System.out.println(euro);
		euro = euro.multiplyBy(5);
		System.out.println(euro);
		
		System.out.println("------------");
		
		System.out.println(usd);
		usd = usd.multiplyBy(4);
		System.out.println(usd);
	}

}
