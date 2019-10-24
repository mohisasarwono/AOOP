public class Car extends Vehicle implements Drivable {
	
	private int rating;
	
	public Car(String name, String color, int wheels, int fuelCapacity,int maxSpeed,int rating) {
		super(name,color, wheels, fuelCapacity, maxSpeed);
		this.rating = rating;
	}

	@Override
	public int calcPrice() {
		return (rating*5000000+fuelCapacity*1000000+maxSpeed*2000000/10);
	}

	@Override
	public void printDetail() {
		System.out.println("Name : "+name+" Color : "+color+" Wheels : "+wheels+" Fuel Capacity : "+fuelCapacity+" maxSpeed : "+maxSpeed+" Rating : "+rating+" Price : "+calcPrice());
	}
	

}