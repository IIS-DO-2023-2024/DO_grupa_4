package strategy;

public class TestStrategy {

	public static void main(String[] args) {
		ShoppingCart studentShoppingCart = new ShoppingCart(new StudentDiscount());
		ShoppingCart pensionersShoppingCart = new ShoppingCart(new PensionersDiscount());
		
		double amount = 100;
		System.out.println("Regularna cena je: " + amount + " RSD");
		
		//Testiranje StudentDiscount strategije
		double studentPrice = studentShoppingCart.calculateTotal(amount);
		System.out.println("Cena za studente je: " + studentPrice + " RSD");
		
		//Testiranje PensionersDiscount strategije
		double pensionersPrice = pensionersShoppingCart.calculateTotal(amount);
		System.out.println("Cena za penzionere je: " + pensionersPrice + " RSD" );
		
		// Strategy: 1) potrebna je realizacija ove strukture  2) Primena logike čuvanja, primeri klasa u nastavku:
		// BufferedWriter - klasa u Javi koja omogućava pisanje podataka u tok podataka (stream); upis u tekstualnu datoteku (.txt)
		// ObjectOtuputStream - klasa u Javi koja omogućava pisanje objekata u tok podataka (stream); čuvanje crteža (.bin)

	}

}
