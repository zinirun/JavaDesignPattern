package motor_deco;

public class Saloon extends AbstractCar{
	public Saloon(Engine engine) {
		super(engine);
	}
	
	public int getPrice() {
		return 6000;
	}
}