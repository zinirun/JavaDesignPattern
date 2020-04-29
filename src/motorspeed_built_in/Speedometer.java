package motorspeed_built_in;

import java.util.Observable;

public class Speedometer extends Observable{
	private int currentSpeed = 0;
	public void setCurrentSpeed(int speed) { this.currentSpeed = speed; speedChanged();}
	public int getCurrentSpeed() { return this.currentSpeed; }
	public void speedChanged() {
		setChanged();
		notifyObservers();
	}
}