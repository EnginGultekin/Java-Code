
public class Main {
	
public static void main(String[] args) {
		
		Employee employee = new Employee("Engin","Engineer",7900);
		
		employee.ShowInfo();
		
        System.out.println();
		Manager manager = new  Manager("Engin G�ltekin" , "Computer Engineer" , 14850,36);
		manager.ShowInfo();
		
		System.out.println();
		System.out.println(manager);	   // Burda manager kulland�k ama arka planda kendisi " toString'e " �evirdi yazd� 
		
	}

}
