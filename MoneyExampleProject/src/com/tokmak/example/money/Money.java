package com.tokmak.example.money;

/**
 * <b>Project MoneyExampleProject</b><br />
 * Money.java<br />
 *
 * <b>created at</b> Apr 21, 2015 10:14:31 PM
 * @author Volkan Tokmak
 * @since 1.00.0
 */
public final class Money
{
	private Double amount 			= null;
	private CurrencyEnum currency 	= null;
	
	/**
	 * <b>Project _MoneyMain</b><br />
	 * Money.java<br />
	 *
	 * <b>created at</b> Apr 21, 2015 10:14:29 PM
	 * @author Volkan Tokmak
	 * @since 1.00.0
	 */
	public enum CurrencyEnum {
		USD,
		EURO;
	}
	
	/**
	 * Money<br />
	 *
	 *
	 * <b>created at</b> Apr 21, 2015 10:14:27 PM
	 * @since 1.00.0
	 * @author Volkan Tokmak
	 */
	public Money() 
	{
		this.amount 	= Double.valueOf(0f);
		this.currency 	= CurrencyEnum.EURO;
	}
	
	/**
	 * Money<br />
	 *
	 * @param argAmount
	 * @param argCurrency
	 *
	 * <b>created at</b> Apr 21, 2015 10:16:00 PM
	 * @since 1.00.0
	 * @author Volkan Tokmak
	 */
	public Money(Double argAmount, CurrencyEnum argCurrency)
	{
		this.amount 	= argAmount;
		this.currency 	= argCurrency;
	}

	/**
	 * Money<br />
	 *
	 * @param argFactor
	 * @return
	 * 
	 * <b>created at</b> Apr 21, 2015 10:16:13 PM
	 * @since 1.00.0
	 * @author Volkan Tokmak
	 */
	public Money multiplyBy(int argFactor)
	{
		this.amount = this.amount * argFactor;
		return this; 
	}

	/**
	 * getAmount<br />
	 * @return the amount
	 *
	 * <b>created at</b> Apr 21, 2015 10:13:32 PM
	 * @author Volkan Tokmak
	 * @since 1.00.0
	 */
	public Double getAmount()
	{
		return this.amount;
	}

	/**
	 * setAmount<br />
	 *
	 * @param argAmount the amount to set
	 *
	 * <b>created at</b> Apr 21, 2015 10:13:32 PM
	 * @author Volkan Tokmak
	 * @since 1.00.0
	 */
	public void setAmount(Double argAmount)
	{
		this.amount = argAmount;
	}

	/**
	 * getCurrency<br />
	 * @return the currency
	 *
	 * <b>created at</b> Apr 21, 2015 10:13:32 PM
	 * @author Volkan Tokmak
	 * @since 1.00.0
	 */
	public CurrencyEnum getCurrency()
	{
		return this.currency;
	}

	/**
	 * setCurrency<br />
	 *
	 * @param argCurrency the currency to set
	 *
	 * <b>created at</b> Apr 21, 2015 10:13:32 PM
	 * @author Volkan Tokmak
	 * @since 1.00.0
	 */
	public void setCurrency(CurrencyEnum argCurrency)
	{
		this.currency = argCurrency;
	}
	
	/**
	 * Money<br />
	 *
	 * @return
	 *
	 * <b>created at</b> Apr 21, 2015 10:24:55 PM
	 * @since 1.00.0
	 * @author Volkan Tokmak
	 */
	@Override
	public String toString()
	{
		return "Money: " + this.amount + " " + this.currency.name();
	}
}
