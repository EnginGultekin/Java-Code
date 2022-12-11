import java.util.Scanner;

public class Main {

	public static void Cal(int[] Arr, int num) {
		
		int total=0;
		for(int i=0; i<num; i++) {
			total += Arr[i];
		}
		System.out.println("-> Toplam : " + total);
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("-> Girmek Ýstediðiniz Miktarý Yazýnýz ");
		int num = s.nextInt();
		int[] Arr = new int[num];
		
		for(int i=0; i<num; i++) {
			
			Arr[i] = s.nextInt(); 
		}
		
		for(int i=0; i<num; i++)
			System.out.println("-> " +(i+1) + ". Elaman : " + Arr[i]);
		
		Cal(Arr,num);
 		
		
	}
	
}
