
public class Main {
	
	public static void main(String[] args) {
		
		Student st = new Student();
		Customer cus = new Customer();
		
		st.Log();
		cus.Log();
		
		// IDatabase d = new IDatabase();   !!!!! Yap�lamaz
		
		System.out.println();                
		IDatabase d = new Customer();        // Bu �ekilde onu implement eden sn�f �zerinden oobjesini olu�turabilir
		d.Log();
		
	}
	

}
