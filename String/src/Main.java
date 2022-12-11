
public class Main {

	public static void main(String[] args) {
		
		String s1 = "Engin";
		String s2 = new String("Engin");
		
		String s3 = "Engin";
		String s4 = new String("Engin");
				
		System.out.println("-> " + s2.length());
		System.out.println("-> " + s2.charAt(0));
		System.out.println("-> " + s2.charAt(3));
		
		System.out.println("-> " + s2.startsWith("En"));
		System.out.println("-> " + s1.endsWith("in") );
		
		
		if(s1 == s2) 
			System.out.println("-> Eþit");
		else 
			System.out.println("-> Eþit Deðil");
		
		if(s1 == s3) 
			System.out.println("-> Eþit");
		else 
			System.out.println("-> Eþit Deðil");
		
		if(s2 == s4) 
			System.out.println("-> Eþit");
		else 
			System.out.println("-> Eþit Deðil");
				
		
		if(s1.equals(s2)) 
			System.out.println("-> Eþit");
		else 
			System.out.println("-> Eþit Deðil");
				
		
	}
	
}
