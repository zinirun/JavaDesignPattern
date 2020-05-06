package motor_deco;

public class LeatherSeatedVehicle extends AbstractVehicleOption{
	Vehicle vehicle;
	
	public LeatherSeatedVehicle(Vehicle vehicle) {
		super(vehicle);
		this.vehicle = vehicle;
	}
	
	public int getPrice() {
		return vehicle.getPrice() + 1200;
	}
}
