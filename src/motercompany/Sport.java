package motercompany;

public class Sport extends AbstractCar{
	public Sport(Engine engine) {
		super(engine);
	}
	public Sport(Engine engine, Vehicle.Colour colour) {
		super(engine, colour);
	}
	@Override
	public Engine getEngine() {
		return super.getEngine();
	}
	@Override
	public Colour getColour() {
		return super.getColour();
	}
	@Override
	public void paint(Colour colour) {
		// TODO Auto-generated method stub
		super.paint(colour);
	}
}
