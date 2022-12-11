
public class Ders17 {
	
	public static void Sum(String name , int Score){		
		System.out.println("-> " + name +  " Ýsimli Oyuncunun Puaný : " + Score);
	} 
			
	public static void Sum(int a,int b,int c,int d) {		
		System.out.println("-> Result of Sum of Four Number : " + (a+b+c+d));
	} 
	public static void Sum(int a,int b,int c) {		
		System.out.println("-> Result of Sum of Three Number : " + (a+b+c));
	} 
	public static void Sum(int a,int b) {		
		System.out.println("-> Result of Sum of Two Number : " + (a+b));
	} 
	
	public static void main(String[] args){		
		
		
		Sum("Engin",101);
		Sum(10,10);
		Sum(10,10,10);
		Sum(10,10,10,10);
	} 

}
