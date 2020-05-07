package motor_deco;

public class AirConditionedVehicle extends AbstractVehicleOption{
	public int temperature;
	
	public AirConditionedVehicle(Vehicle vehicle) {
		super(vehicle);
	}
	
	public int getPrice() {
		return super.getPrice() + 600;
	}
	
	public void setTemperature(int temperature) {
		//set vehicle's temperature
		this.temperature = temperature;
	}
}
