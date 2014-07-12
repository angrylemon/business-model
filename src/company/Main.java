package company;

public class Main
{

	public static void main(String[] args)
	{
		Good lemon = new Good("Lemon");
		Good apple = new Good("Apple");
		Good plate = new Good("Plate");
		
 		Business bus1 = new Business(20000);
 		
 		
		bus1.addGood(lemon, 30);
		bus1.addGood(apple, 20);
		bus1.addGood(plate, 12);
		bus1.printGoods();
		
		
	}

}
