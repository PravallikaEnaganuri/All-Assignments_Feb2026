package WeeklyAssignments;


class Vehicle{
	String brand;
	String speed;
	
	
	Vehicle(String brand, String speed){
		this.brand = brand;
		this.speed = speed;
	}
	
	void run() {
		System.out.println("Vehicle is running");
	}
	
	static String company = "AutoWorld Ltd";
	static void displayCompany() {
		System.out.println("Company: " + company);
	}
	
	 final void engineType() {
		 System.out.println("Engine type: Standard Engine");
	 }
}

class Car extends Vehicle{
	String fuelType;
	
	Car(String brand, String speed ,String fuelType){
		super(brand,speed);
		this.fuelType = fuelType;
	}
	void run() {
		System.out.println("car is running smoothly");
	}
	
	
}

public class Assignment7_Vehicle {

	public static void main(String[] args) {
		
      Car c = new Car("Hyundai","120","petrol");
      System.out.println("Brand: " + c.brand);
      System.out.println("Speed: " + c.speed);
      System.out.println("FuelType: " + c.fuelType);
      
      Vehicle v = new Vehicle("hyundai","120");
      v.run();
      c.run();
      Vehicle.displayCompany();
      v.engineType();
      
      
      String str = c.brand;
     
		StringBuilder reverse = new StringBuilder();
		String[]words =str.split(" ");
		for (String word:words)
		{
			StringBuilder sb =new StringBuilder(word);
			reverse = reverse.append(" ").append(sb.reverse());
		}
	
		String reverseReuslt=reverse.toString().trim();
		System.out.println(reverseReuslt);
		
	}

}
