import java.util.Scanner;

public class Ders8 {    // Mantýksal operatörler ve koþullu durum 
	
	public static void main(String[] args ){
		
		String kul_adý = "Eng";
		String parola = "140053";
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("-> Kullanýcý Adý :");
        String kullanýcý_adý = s.nextLine();
        
        System.out.println("-> Parola ");
        String KParola = s.nextLine();

        
        if( !(kul_adý.equals(kullanýcý_adý))  &&  !(parola.equals(KParola))){
           
        	System.out.println("- Kullanýcý adýnýz ve parolanýz yanlýþ");
        	
        }
        else if( !(kul_adý.equals(kullanýcý_adý))  &&  (parola.equals(KParola))){
        	
        	System.out.println("- Kullanýcý adýnýz yanlýþ");
        	
        }
        else if( (kul_adý.equals(kullanýcý_adý))  &&  !(parola.equals(KParola))){
        	
        	System.out.println("- Parolanýz yanlýþ");	
        }
        else
        	System.out.println("-> Giriþ Baþarýlý");
		
	} 

}
