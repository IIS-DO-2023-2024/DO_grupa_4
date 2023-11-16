package observer2;

import java.util.Observable;
import java.util.Observer;

public class CryptoCurrencyUpdateSMS implements Observer{
	private double bitcoinPrice;
	private double etherPrice;

	@Override
	public void update(Observable o, Object arg) {
		CryptoCurrencyPrice cp = (CryptoCurrencyPrice)o;
		this.bitcoinPrice = cp.getBitcoinPrice();
		this.etherPrice = cp.getEtherPrice();
		sendSMS();
	}
	
	public void sendSMS() {
		System.out.println("New price of bitcoin is: " + bitcoinPrice);
		System.out.println("New price of ether is: " + etherPrice);
	}

}
