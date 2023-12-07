package builder1;

public class SeafoodPizzaBuilder implements PizzaBuilder {
	
	Pizza pizza;
	
	public SeafoodPizzaBuilder() {
		pizza = new Pizza();
	}

	@Override
	public void putDought() {
		pizza.setDough("integralno");
	}

	@Override
	public void putSauce() {
		pizza.setSauce("paradajz sos");
	}

	@Override
	public void putCheese() {
		pizza.setCheese("gauda");

	}

	@Override
	public void putMeat() {
		pizza.setMeat("škampi");
		//pizza.setMeat("tuna");

	}

	@Override
	public Pizza getPizza() {
		return this.pizza;
	}

}
