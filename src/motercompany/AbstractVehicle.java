package motercompany;

public abstract class AbstractVehicle implements Vehicle{
	private Engine engine;
	private Colour colour;
	
	public AbstractVehicle(Engine engine) {
		this.engine = engine;
	}
	public AbstractVehicle(Engine engine, Vehicle.Colour colour) {
		this.engine = engine;
		this.colour = colour;
	}
	public Engine getEngine() {
		return this.engine;
	}
	public Colour getColour(){
		return this.colour;
	}
	public void paint(Vehicle.Colour colour) {
		this.colour = colour;
	}
	
}
