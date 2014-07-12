package company;

import java.util.HashMap;
import java.util.Map;

public class Business
{
	private int account;
	private Map<Good, Integer> goods = new HashMap<>(); 
	
	public Business()
	{
		
	}

	public Business(int account)
	{
		super();
		this.account = account;
	}
	public void addGood(Good good, int amount)
	{
		
	}
	
}
