package motercompany;

public class SportGearboxStrategy implements GearboxStrategy{
	public void ensureCorrectGear(Engine engine, int speed) {
		System.out.println("Working out correct gear at " + speed + "mph for a Sport gearbox");
	}
}