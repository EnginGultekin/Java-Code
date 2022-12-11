
public class Car {
	
	private String model;
	private String color;
	private double engine;
	private int door_num;
	
	
	public Car() {    // Default Constructor
		
		this("UnKnown", "UnKnown", 0 , 0);
	}
	
	public Car(String model, String color) {    // Overloding yaptýk iki özelliði kullandýk sadece
		
		this(model, color ,0 ,0);
	}
	
	public Car(String model, String color, double engine, int door_num) {  // Constructor
		
		this.model = model;
		this.color = color;
		this.engine = engine;
		this.door_num = door_num;
		
	}
	
	public void  ShowInfo() {
	
		System.out.println("-> Model of Car : " + this.model);
		System.out.println("-> Color of Car : " + this.color);
		System.out.println("-> Engine of Car : " + this.engine);
		System.out.println("-> Number of doors : "+ this.door_num);
				
	}
	

}
