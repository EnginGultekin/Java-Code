import java.util.Scanner;

public class Ders15 {

	public static void Sum(int a, int b, int c) {
		
		System.out.println("-> Result of Sum: " + (a+b+c));
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("-> enter Three Number");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		Sum(a,b,c);
		Sum((2*a),(b-2),(8/c));
	}
	
}
