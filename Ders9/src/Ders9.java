import java.util.Scanner;

public class Ders9 {
	
	public static void main(String[] args ){
		
		Scanner s = new Scanner(System.in);
		int bakiye = 10000;
		int miktar = 0;
		int islem;
		boolean yeni = true;  

		System.out.println("-> Hosgeldýnýz Yapacagýnýz Islem Icýn Fýs Istem misiniz ? EVET=1/HAYIR=0");
		islem = s.nextInt();
		if(islem == 1)
			System.out.println("-> Fýsý Almayý Unutmayýn !");
		else if (islem == 0)
			System.out.println("-> Doðayý Koruduðunuz için Tesekkurler !");
		else
			System.out.println("-> Gecersiz Islem");
		
		while(yeni){
			System.out.println("-> Lutfen Yapmak Istedýgýnýz Islemý Secin");
			
			System.out.println("-> 1 : Bakiye Sorgulama ");
			System.out.println("-> 2 : Para Yatýrma ");
			System.out.println("-> 3 : Havale/EFT ");
			System.out.println("-> 4 : Para Çekme ");
			System.out.println("-> 5 : Kart Ýade ");
			
			islem = s.nextInt();
			
			switch(islem) {
			
			case 1: 
				System.out.println("-> Güncel Bakiyeniz : " + bakiye + " Türk Lirasýdýr");
				break;
				
			case 2: 
				System.out.println("-> Yatýrýlacak Tutarý Giriniz ");
				miktar = s.nextInt();
				bakiye += miktar;
				System.out.println("-> Yeni Bakiyeniz : " + bakiye + " Türk Lirasýdýr");
				break;
				
			case 3: 
				
				System.out.println("-> 1 : Havale ");
				System.out.println("-> 2 : EFT ");
				islem  = s.nextInt();
				if(islem == 1) {
					System.out.println("-> Islem Yapýlacak Hesap Numarasýný Giriniz");
					islem = s.nextInt();
					System.out.println("-> Göndermek Istediginiz Tutarý Giriniz");
					miktar = s.nextInt();
					bakiye -= miktar;
				}
				else if(islem == 2) {
					System.out.println("-> Islem Yapýlacak Iban Numarasýný Giriniz");
					islem = s.nextInt();
					System.out.println("-> Göndermek Istediginiz Tutarý Giriniz");
					miktar = s.nextInt();
					bakiye -= miktar;
				}
				else
					System.out.println("-> Geçersiz Ýþlem");
				System.out.println("-> Güncel Bakiyeniz : " + bakiye + " Türk Lirasýdýr");
				break;
				
			case 4: 
				System.out.println("-> Cekmek Istediðiniz Tutarý Giriniz ");
				miktar = s.nextInt();
				bakiye -= miktar;
				System.out.println("->Kalan Bakiyeniz : " + bakiye + " Türk Lirasýdýr");
				break;
				
			case 5: 
				System.out.println("-> Kartýnýzý Alabilirsiniz");
				System.out.println("---------------- BANKAMIZI TERCIH ETTIGINIZ ICIN TESEKKURLER ----------------");
				break;			
			default:
				System.out.println("-> Geçersiz Islem");			
			} 		
			
			if(islem== 5) {
		        break;	
			}
			else {
				System.out.println("-> Baþka Bir Ýþlem Yapmak Ýstiyor musunuz ? EVET=1/HAYIR=0");
				islem = s.nextInt();
		        if(islem == 1)
		        	yeni = true;
		        else if(islem == 0){
		        	yeni = false;
		        	System.out.println("-> Kartýnýzý Alabilirsiniz");
		        	System.out.println("---------------- BANKAMIZI TERCIH ETTIGINIZ ICIN TESEKKURLER ----------------");
		        }
		        else
		        	System.out.println("-> Geçersiz Islem"); 	
			}
		}						
	}
}
