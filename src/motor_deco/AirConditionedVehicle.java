package motor_deco;

public class AirConditionedVehicle extends AbstractVehicleOption{
	Vehicle vehicle;
	
	public AirConditionedVehicle(Vehicle vehicle) {
		super(vehicle);
		this.vehicle = vehicle;
	}
	
	public int getPrice() {
		return vehicle.getPrice() + 660;
	}
	
	public void setTemperature(int temperature) {
		//set vehicle's temperature
	}
}
