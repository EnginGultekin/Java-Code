import java.util.Scanner;

public class Ders16 {
	
	public static int Func1(int a) {
		
		return (2*a);
	}
	public static int Func2(int a) {
			
			return (a+a);
		}
	public static int Func3(int a) {
		
		return (a/2);
	}
	public static int Func4(int a) {
		
		return (a-20);
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("-> Say� Gir");
		int sayi = s.nextInt();
		
		System.out.println("-> First: 2 ile �arp : " + Func1(sayi));
		System.out.println("-> Second: Kendisiyle Topla : " + Func2(Func1(sayi)));
		System.out.println("-> Third: 2 ile B�l : " + Func3(Func2(Func1(sayi))));
		System.out.println("-> Fourth: 20 ��kar : " + Func4(Func3(Func2(Func1(sayi)))));
		
		
	}

}
