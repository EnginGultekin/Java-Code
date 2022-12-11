
public class Manager extends Employee {
	
	private int num_of_Emp;
	public Manager(String name, String department, int salary,int num_of_Emp) {
		super(name, department, salary);
		this.num_of_Emp = num_of_Emp;
		
	}
	@Override
	public void ShowInfo() {
		super.ShowInfo();
		System.out.println("-> Number of Emp for Manager : " + this.num_of_Emp );
	}
	@Override
	public String toString() {
		
		return "Manager Object";
	}
	
	
	

	

}
