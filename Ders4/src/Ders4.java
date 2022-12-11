import java.util.Locale;
import java.util.Scanner;

public class Ders4 {

	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("-> Please enter a number ");  
		int a = s1.nextInt();                               // For Ýnteger
		System.out.println("-> Value is a : " + a);

		Scanner s2 = new Scanner(System.in);
		
		System.out.println("-> Please enter your name ");
		String st = s2.nextLine();                            // For String    
		System.out.println("-> String is : " + st );
		
		
		
		Scanner s3 = new Scanner(System.in);
		s3.useLocale(Locale.US);
		
		System.out.println("-> Please enter your high ");
		double d = s3.nextDouble();								// For Double
		System.out.println("-> High is : " + d );
		
		
		
	}
	
	
}
