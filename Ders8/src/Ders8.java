import java.util.Scanner;

public class Ders8 {    // Mant�ksal operat�rler ve ko�ullu durum 
	
	public static void main(String[] args ){
		
		String kul_ad� = "Eng";
		String parola = "140053";
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("-> Kullan�c� Ad� :");
        String kullan�c�_ad� = s.nextLine();
        
        System.out.println("-> Parola ");
        String KParola = s.nextLine();

        
        if( !(kul_ad�.equals(kullan�c�_ad�))  &&  !(parola.equals(KParola))){
           
        	System.out.println("- Kullan�c� ad�n�z ve parolan�z yanl��");
        	
        }
        else if( !(kul_ad�.equals(kullan�c�_ad�))  &&  (parola.equals(KParola))){
        	
        	System.out.println("- Kullan�c� ad�n�z yanl��");
        	
        }
        else if( (kul_ad�.equals(kullan�c�_ad�))  &&  !(parola.equals(KParola))){
        	
        	System.out.println("- Parolan�z yanl��");	
        }
        else
        	System.out.println("-> Giri� Ba�ar�l�");
		
	} 

}
