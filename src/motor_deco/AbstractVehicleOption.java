package motor_deco;

public abstract class AbstractVehicleOption extends AbstractVehicle{
	Vehicle vehicle;
	
	public AbstractVehicleOption(Vehicle vehicle) {
		super(vehicle.getEngine());
		this.vehicle = vehicle;
	}
	
	public int getPrice() {
		return vehicle.getPrice();
	}
}
