package facade;

public class Car {
	private int remoteCode = 1234;
	private String carKey = "šara";
	private boolean isRaining;
	private boolean previousState;
	
	public boolean isRaining() {
		return isRaining;
	}
	public void setRaining(boolean isRaining) {
		this.isRaining = isRaining;
	}
	public boolean isPreviousState() {
		return previousState;
	}
	public void setPreviousState(boolean previousState) {
		this.previousState = previousState;
	}
	public int getRemoteCode() {
		return remoteCode;
	}
	public String getCarKey() {
		return carKey;
	}
	
	

}
