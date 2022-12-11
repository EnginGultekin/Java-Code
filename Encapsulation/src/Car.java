
public class Car {
	
	private String model;
	private String color;
	private double engine;
	private int door_num;
	
	public void setColor(String color) {   
		   this.color = color;
	}
	public String getColor() {
	   return this.color;	   
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public int getDoor_num() {
		return door_num;
	}
	public void setDoor_num(int door_num) {
		
		if(door_num == 2 || door_num == 4) {
			this.door_num = door_num;
		}
		else
			System.out.println("-> Kapı Sayısı Sadece 4 veya 2 Olmalıdır !!!!");	
	}

}
