package state;

public class Car implements CarBehavior{
	private TurnedOffState turnedOffState;
	private TurnedOnState turnedOnState;
	private IdleState idleState;
	private MovingState movingState;
	
	public CarBehavior currentState;
	
	public Car() {
		turnedOnState = new TurnedOnState(this);
		turnedOffState = new TurnedOffState(this);
		idleState = new IdleState(this);
		movingState = new MovingState(this);
		
		currentState = turnedOffState;
	}

	@Override
	public void turnOn() {
		currentState.turnOn();
	}

	@Override
	public void turnedOff() {
		currentState.turnedOff();
	}

	@Override
	public void goIdle() {
		currentState.goIdle();
	}

	@Override
	public void move() {
		currentState.move();
	}

	public TurnedOnState getTurnedOnState() {
		return turnedOnState;
	}

	public void setTurnedOnState(TurnedOnState turnedOnState) {
		this.turnedOnState = turnedOnState;
	}

	public TurnedOffState getTurnedOffState() {
		return turnedOffState;
	}

	public void setTurnedOffState(TurnedOffState turnedOffState) {
		this.turnedOffState = turnedOffState;
	}

	public IdleState getIdleState() {
		return idleState;
	}

	public void setIdleState(IdleState idleState) {
		this.idleState = idleState;
	}

	public MovingState getMovingState() {
		return movingState;
	}

	public void setMovingState(MovingState movingState) {
		this.movingState = movingState;
	}

	public CarBehavior getCurrentState() {
		return currentState;
	}


	
	public void setCurrentState(CarBehavior currentState) {
		this.currentState = currentState;
	}
	
	
	
//	private State state;
//	
//	public void turnOn() {
//		if(state.intanceOf(turnedOnState)) {
//			System.out.println("Car is already turned on...");
//		} else if(state.instaceOf(turnedOff)) {
//			state = turnedOn;
//			System.out.println("Car is now turned on.");
//		} else if(state.instanceOf(idle)) {
//			System.out.println("Car is already turned on...");
//		} else if(state.instanceOf(moving)) {
//			System.out.println("Car is already turned on...");
//		}
//	}

}
