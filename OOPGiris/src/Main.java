
public class Main {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.model = "OPEL ASTRA";
		car.color = "BLACK";
		car.engine = 4.6;
		car.door_num = 2;
		
		System.out.println("-> Model of Car is " + car.model);
		System.out.println("-> Color of Car is " + car.color);
		System.out.println("-> Engine of Car is " + car.engine);
		System.out.println("-> Number of Doors is " + car.door_num);
	}

}
