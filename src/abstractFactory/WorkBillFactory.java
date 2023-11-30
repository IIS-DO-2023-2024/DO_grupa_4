package abstractFactory;

import simpleFactory.Bill;

public class WorkBillFactory extends BillFactory{

	@Override
	public Bill createBill(String type) {
		if(type.equals("VAT"))
			return new VatBill();
		else if(type.equals("Tax"))
			return new TaxBill();
		else
			return null;
	}
	

}
