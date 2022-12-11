
public class Main {

public static void main(String[] args) {
		
		Car car = new Car();
		
		car.setModel("OPEL ASTRA");
		car.setColor("BLACK");
		car.setEngine(4.6);
		car.setDoor_num(2);
		
		System.out.println("-> Model of Car is " + car.getModel());
		System.out.println("-> Color of Car is " + car.getColor());
		System.out.println("-> Engine of Car is " + car.getEngine());
		System.out.println("-> Number of Doors is " + car.getDoor_num());
		
	}
	
}
