package facade;

public class TestFacade {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.setRaining(true);
		car.setPreviousState(true);

		CarFacade carFacade = new CarFacade(car, 1234, "šara");
		System.out.println(carFacade.startTheCar());
	}

}
