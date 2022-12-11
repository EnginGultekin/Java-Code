
public class Main {
	
	public static void main(String[] args) {
		
		Car car1 = new Car("Opel Astra","Blak_White", 5.2 , 4);
	    Car car2 = car1;     // Referans !!!!!  artýk ikiside ayný yeri gösteriyor
	    
	    car2.ShowInfo();
		System.out.println();
		
		String s1 = new String("Engin");
		String s2 = new String("Engin");

	
		if(s1 == s2)                              // Burda Bellekteki yerlerini karþýlaþtrmýþ olduk
			System.out.println("-> Eþit ");
			else
				System.out.println("-> Eþit Deðil ");
	
		if(s1.equals(s2))                              // Burda tutmuþ olduklarý Stringleri
			System.out.println("-> Eþit ");
			else
				System.out.println("-> Eþit Deðil ");
	    	    
	    
	}	

}
