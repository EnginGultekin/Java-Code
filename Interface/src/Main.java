
public class Main {
	
	public static void main(String[] args) {
		
		Student st = new Student();
		Customer cus = new Customer();
		
		st.Log();
		cus.Log();
		
		// IDatabase d = new IDatabase();   !!!!! Yapýlamaz
		
		System.out.println();                
		IDatabase d = new Customer();        // Bu þekilde onu implement eden snýf üzerinden oobjesini oluþturabilir
		d.Log();
		
	}
	

}
