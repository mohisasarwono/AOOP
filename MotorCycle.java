
public class MotorCycle extends Vehicle {

	public MotorCycle(String name, String brand, String color, int wheels, int fuelCapacity, int maxSpeed) {
		super(name, brand, color, wheels, fuelCapacity, maxSpeed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getSound() {
	System.out.println("Tinn, Tinn");
	}
	
}
