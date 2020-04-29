package motorspeed;

public class SpeedMonitor implements Observer{
	public static final int SPEED_TO_ALERT = 70;
	
	@Override
	public void update(Observable obs, Object obj) {
		Speedometer speedo = (Speedometer) obs;
		if(speedo.getCurrentSpeed() > SPEED_TO_ALERT) {
			System.out.println("**ALERT** Driving too fast! ("+speedo.getCurrentSpeed()+")");
		}
		else {
			System.out.println("... nice and steady... ("+speedo.getCurrentSpeed()+")");
		}
	}
}