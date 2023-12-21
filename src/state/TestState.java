package state;

public class TestState {

	public static void main(String[] args) {
		Car car = new Car();
		car.turnOn();
		car.move();
		car.goIdle();
		car.turnedOff();
		car.move();
		car.turnOn();
		car.move();
		car.turnOn();
		car.turnedOff();
	}

}
