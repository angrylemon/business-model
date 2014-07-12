package company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Business
{
	private double account;
	private Map<Good, Integer> goods = new HashMap<>();
	private Map<Good, Integer> prices;

	public Business()
	{

	}

	public Business(int account)
	{
		super();
		this.account = account;
	}

	/**
	 * Adds given good to the store of the business
	 * 
	 * @param good
	 * @param amount
	 */
	public void addGood(Good good, int amount)
	{
		if (goods.containsKey(good))
			goods.put(good, goods.get(good));
		else
			goods.put(good, amount);
	}

	public void changeAccount(int amount)
	{
		this.account += amount;
	}

	/**
	 * Shows the current balance of business' account
	 * 
	 * @return balance of account
	 */
	public double getAccount()
	{
		return this.account;
	}

	public void printGoods()
	{
		Set<Good> keySet = this.goods.keySet();

		for (Good key : keySet)
		{
			System.out.println(key.getName() + " : " + goods.get(key));
		}
	}

}
