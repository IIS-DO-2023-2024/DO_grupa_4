package builder1;

public class TestBuilder {
	public static void main(String[] args)
	{
		PizzaBuilder seafoodPizzaBuilder = new SeafoodPizzaBuilder();
		PizzaChef chef = new PizzaChef(seafoodPizzaBuilder);
		
		chef.makePizza();
		
		Pizza pizza = chef.getPizza();
		System.out.println("We made: " + pizza);
	}
}
