
public class Employee {
	
	private String name;
	private String department;
	private int salary;
	
	public Employee(String name, String department, int salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public void ShowInfo() {
		
		System.out.println("-> Ýnformation of Employee ");
		System.out.println();
		System.out.println("-> Name of Employee : " + this.name);
		System.out.println("-> Department of Employee : " + this.department);
		System.out.println("-> Salary of Employee : " + this.salary);
		
	}


}
