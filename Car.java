
public class Car extends Vehicle  {

	
	public Car(String name, String brand, String color, int wheels, int fuelCapacity, int maxSpeed) {
		super(name, brand, color, wheels, fuelCapacity, maxSpeed);	
	}
	

	@Override
	public void getSound() {
		System.out.println("Bemm, Bemm");
	}
	
}
