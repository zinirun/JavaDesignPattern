package motor_deco;

public class AlloyWheeledVehicle extends AbstractVehicleOption{
	Vehicle vehicle;
	
	public AlloyWheeledVehicle(Vehicle vehicle) {
		super(vehicle);
		this.vehicle = vehicle;
	}
	
	public int getPrice() {
		return vehicle.getPrice() + 250;
	}
}
