
public class Main {
	
	public static void main(String[] args) {
		
		Car car1 = new Car("Opel Astra","Blak_White", 5.2 , 4);
	    Car car2 = car1;     // Referans !!!!!  art�k ikiside ayn� yeri g�steriyor
	    
	    car2.ShowInfo();
		System.out.println();
		
		String s1 = new String("Engin");
		String s2 = new String("Engin");

	
		if(s1 == s2)                              // Burda Bellekteki yerlerini kar��la�trm�� olduk
			System.out.println("-> E�it ");
			else
				System.out.println("-> E�it De�il ");
	
		if(s1.equals(s2))                              // Burda tutmu� olduklar� Stringleri
			System.out.println("-> E�it ");
			else
				System.out.println("-> E�it De�il ");
	    	    
	    
	}	

}
