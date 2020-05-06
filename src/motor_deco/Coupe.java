package motor_deco;

public class Coupe extends AbstractVehicle{
	public Coupe(Engine engine) {
		super(engine);
	}
	
	public int getPrice() {
		return 7000;
	}
}
