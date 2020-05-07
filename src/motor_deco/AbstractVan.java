package motor_deco;

public abstract class AbstractVan extends AbstractVehicle{
	Vehicle vehicle;
	
	public AbstractVan(Engine engine) {
		super(engine);
	}
	
	public Engine getEngine(){
		return super.getEngine();
	}
	
	public Vehicle.Colour getColour(){
		return super.getColour();
	}
	
	public void paint(Vehicle.Colour colour) {
		super.paint(colour);
	}
}
