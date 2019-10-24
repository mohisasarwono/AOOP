public abstract class Vehicle {
	protected String name, color;
	protected int wheels, fuelCapacity, maxSpeed;
	
	public Vehicle(String name, String color, int wheels, int fuelCapacity, int maxSpeed) {
		this.name = name;
		this.color = color;
		this.wheels = wheels;
		this.fuelCapacity = fuelCapacity;
		this.maxSpeed = maxSpeed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void printDetail() {
		System.out.println("Name : "+name+" Color : "+color+" Wheels : "+wheels+" Fuel Capacity : "+fuelCapacity+" maxSpeed : "+maxSpeed+" Price : "+calcPrice());
	}
	
	public abstract int calcPrice();

	
}
