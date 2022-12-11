
public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Engin","Engineer",7900);
		
		employee.ShowInfo();
		
        System.out.println();
		Manager manager = new  Manager("Engin Gültekin" , "Computer Engineer" , 14850);
		manager.ShowInfo();
	}
	
}
