import java.util.Scanner;

public class Main {
	
	public Main() {
		Scanner sc = new Scanner(System.in);
		String vehicleType,name,color;
		int wheels = 2,fuelCapacity, maxSpeed,rating=0;
		
		System.out.print("Car or Motorcycle  : ");
		vehicleType = sc.nextLine();
	
		System.out.print("Name  : ");
		name = sc.nextLine();
		
		System.out.print("Color  : ");
		color = sc.nextLine();
		
		System.out.print("Fuel Capacity  : ");
		fuelCapacity = sc.nextInt();
		
		System.out.print("Top Speed  : ");
		maxSpeed = sc.nextInt();
		sc.nextLine();
		
		if(vehicleType.equals("Car")==true){
		System.out.print("Rating  : ");
		rating = sc.nextInt();
		sc.nextLine();}
		
		switch (vehicleType){
		case "Car" : 
			wheels = 4;
			Car car = new Car(name, color, wheels, fuelCapacity, maxSpeed, rating);
			car.printDetail();
			break;
		case "Motorcycle" :
			MotorCycle motorcycle= new MotorCycle(name, color, wheels, fuelCapacity, maxSpeed);
			motorcycle.printDetail();
			break;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		new Main();
	}
}
