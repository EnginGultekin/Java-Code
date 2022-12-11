import java.util.Scanner;

public class Ders13 {    // Break -- Contnue
	
	public static void main(String[] args) {
		
		int i=0;
		while(i<10) {
			
			if(i==3 || i==6) {
				i++;
				continue;
			}
			
			System.out.println("-> i = " + i);
			i++;
			
		}
		
		while(true) {
			Scanner s = new Scanner(System.in);	
			System.out.println("-> Karakter Giriniz ");
			String st = s.nextLine();
			
			if(st.equals("q")) {
				System.out.println("-> Çýkýþ Yapýlýyor ... ");
				break;
				
			}
			
			System.out.println("-> Karakter : "+ st );	    		
	    }
	}	
}
