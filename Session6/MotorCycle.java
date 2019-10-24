
public class MotorCycle extends Vehicle implements Drivable {

	public MotorCycle(String name, String color, int wheels, int fuelCapacity, int maxSpeed) {
		super(name, color, wheels, fuelCapacity, maxSpeed);
	}

	@Override
	public int calcPrice() {
		return fuelCapacity*800000+maxSpeed*500000/10;
	}

}
