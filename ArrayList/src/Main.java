import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<String> grop = new ArrayList<String>();
		
		grop.add("Black DOG");   // --> ekle
 		grop.add("Metelica");
		grop.add("Manga");
		grop.add("Athena");

		for(int i=0; i < grop.size(); i++) {		// size() --> uzunluðu
			System.out.println("-> " + grop.get(i));
		}
		System.out.println();
		grop.remove(1);              // --> sil
		
		for(int i=0; i < grop.size(); i++) {
			System.out.println("-> " + grop.get(i));
		}		
			
	}

}
