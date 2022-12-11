import java.util.Scanner;

public class Ders9 {
	
	public static void main(String[] args ){
		
		Scanner s = new Scanner(System.in);
		int bakiye = 10000;
		int miktar = 0;
		int islem;
		boolean yeni = true;  

		System.out.println("-> Hosgeld�n�z Yapacag�n�z Islem Ic�n F�s Istem misiniz ? EVET=1/HAYIR=0");
		islem = s.nextInt();
		if(islem == 1)
			System.out.println("-> F�s� Almay� Unutmay�n !");
		else if (islem == 0)
			System.out.println("-> Do�ay� Korudu�unuz i�in Tesekkurler !");
		else
			System.out.println("-> Gecersiz Islem");
		
		while(yeni){
			System.out.println("-> Lutfen Yapmak Isted�g�n�z Islem� Secin");
			
			System.out.println("-> 1 : Bakiye Sorgulama ");
			System.out.println("-> 2 : Para Yat�rma ");
			System.out.println("-> 3 : Havale/EFT ");
			System.out.println("-> 4 : Para �ekme ");
			System.out.println("-> 5 : Kart �ade ");
			
			islem = s.nextInt();
			
			switch(islem) {
			
			case 1: 
				System.out.println("-> G�ncel Bakiyeniz : " + bakiye + " T�rk Liras�d�r");
				break;
				
			case 2: 
				System.out.println("-> Yat�r�lacak Tutar� Giriniz ");
				miktar = s.nextInt();
				bakiye += miktar;
				System.out.println("-> Yeni Bakiyeniz : " + bakiye + " T�rk Liras�d�r");
				break;
				
			case 3: 
				
				System.out.println("-> 1 : Havale ");
				System.out.println("-> 2 : EFT ");
				islem  = s.nextInt();
				if(islem == 1) {
					System.out.println("-> Islem Yap�lacak Hesap Numaras�n� Giriniz");
					islem = s.nextInt();
					System.out.println("-> G�ndermek Istediginiz Tutar� Giriniz");
					miktar = s.nextInt();
					bakiye -= miktar;
				}
				else if(islem == 2) {
					System.out.println("-> Islem Yap�lacak Iban Numaras�n� Giriniz");
					islem = s.nextInt();
					System.out.println("-> G�ndermek Istediginiz Tutar� Giriniz");
					miktar = s.nextInt();
					bakiye -= miktar;
				}
				else
					System.out.println("-> Ge�ersiz ��lem");
				System.out.println("-> G�ncel Bakiyeniz : " + bakiye + " T�rk Liras�d�r");
				break;
				
			case 4: 
				System.out.println("-> Cekmek Istedi�iniz Tutar� Giriniz ");
				miktar = s.nextInt();
				bakiye -= miktar;
				System.out.println("->Kalan Bakiyeniz : " + bakiye + " T�rk Liras�d�r");
				break;
				
			case 5: 
				System.out.println("-> Kart�n�z� Alabilirsiniz");
				System.out.println("---------------- BANKAMIZI TERCIH ETTIGINIZ ICIN TESEKKURLER ----------------");
				break;			
			default:
				System.out.println("-> Ge�ersiz Islem");			
			} 		
			
			if(islem== 5) {
		        break;	
			}
			else {
				System.out.println("-> Ba�ka Bir ��lem Yapmak �stiyor musunuz ? EVET=1/HAYIR=0");
				islem = s.nextInt();
		        if(islem == 1)
		        	yeni = true;
		        else if(islem == 0){
		        	yeni = false;
		        	System.out.println("-> Kart�n�z� Alabilirsiniz");
		        	System.out.println("---------------- BANKAMIZI TERCIH ETTIGINIZ ICIN TESEKKURLER ----------------");
		        }
		        else
		        	System.out.println("-> Ge�ersiz Islem"); 	
			}
		}						
	}
}
