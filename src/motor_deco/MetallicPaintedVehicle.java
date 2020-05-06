package motor_deco;

public class MetallicPaintedVehicle extends AbstractVehicleOption{
	Vehicle vehicle;
	
	public MetallicPaintedVehicle(Vehicle vehicle) {
		super(vehicle);
		this.vehicle = vehicle;
	}
	
	public int getPrice() {
		return vehicle.getPrice() + 750;
	}
}
