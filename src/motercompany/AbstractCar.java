package motercompany;

public abstract class AbstractCar extends AbstractVehicle{
	GearboxStrategy gs;
	public AbstractCar(Engine engine) {
		super(engine);
		gs = new StandardGearboxStrategy();
	}
	
	public AbstractCar(Engine engine, Colour colour) {
		super(engine, colour);
	}

	public void setGearboxStrategy(GearboxStrategy gs) {
		this.gs = gs;
	}
	
	public GearboxStrategy getGearboxStrategy() {
		return this.gs;
	}
	public void setSpeed(int speed) {
		gs.ensureCorrectGear(getEngine(), speed);
	}
}