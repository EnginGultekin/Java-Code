
public class Main {
	
	public static void main(String[] args) {
		
		Car car1 = new Car("Opel Astra","Blak_White", 5.2 , 4);
		Car car2 = new Car("Mercedes Benz", "Red_Green");
		Car car3 = new Car();
		car1.ShowInfo();
		System.out.println();
		car2.ShowInfo();
		System.out.println();
		car3.ShowInfo();
		
	} 

}
