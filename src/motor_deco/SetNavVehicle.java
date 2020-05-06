package motor_deco;

public class SetNavVehicle extends AbstractVehicleOption{
	Vehicle vehicle;
	
	public SetNavVehicle(Vehicle vehicle) {
		super(vehicle);
		this.vehicle = vehicle;
	}
	
	public int getPrice() {
		return vehicle.getPrice() + 1500;
	}
	
	public void setDestination(String dest) {
		//set destination
	}
}
