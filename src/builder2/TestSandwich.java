package builder2;

public class TestSandwich {

	public static void main(String[] args) {
		Sandwich.Builder builder = new Sandwich.Builder("integralna");
		
		builder.spread("urnebes").spread("majonez").meat("kulen").salad("zelena").spread("pavlaka").salad("paradajz");
		
		Sandwich sandwich = builder.build();

		System.out.println(sandwich);
	}

}
