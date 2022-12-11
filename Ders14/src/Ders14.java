import java.util.Scanner;

public class Ders14 {
	
	public static void Fac() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("-> Sayi: ");
		
		int fac=1;
		int sayi = scan.nextInt();
		
		for(; sayi > 0; sayi-- )
			fac *= sayi;				
		System.out.println("-> Factorial Result is : " + fac);		
	}
	
	public static void main(String[] args) {
		
		Fac();
		Fac();		
	}

}
