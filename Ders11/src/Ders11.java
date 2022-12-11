import java.util.Scanner;

public class Ders11 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int sayi = s.nextInt();	
		int toplam= 0;
		
		do {
			toplam += (sayi % 10);
			sayi /= 10;	
		} 
		while(sayi > 0);	
		
		System.out.println("Toplam : " + toplam + "  Þeklindedir");
		
	}

}
