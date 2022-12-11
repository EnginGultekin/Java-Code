import java.util.ArrayList;

public class Main {
	
public static void main(String[] args) {
		
		ArrayList<String> grop = new ArrayList<String>();
		
		grop.add("Black DOG");   // --> ekle
 		grop.add("Metelica");
		grop.add("Manga");
		grop.add("Athena");

		for(String s : grop) {			             // !!!!!!!!!!!!!!!!!!!! //
			System.out.println("-> " + s );
		}
			
	}

}
