package motorspeed;

public class Speedometer extends Observable{
	//Simulator of a speedometer (�ӵ���)
	private int currentSpeed = 0;
	public void setCurrentSpeed(int speed) { this.currentSpeed = speed; setChanged();}
	public int getCurrentSpeed() { return this.currentSpeed; }
}
