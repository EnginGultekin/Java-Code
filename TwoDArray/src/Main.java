
public class Main {

	public static void main(String[] args) {
		
		int[][] Arr = new int[4][3];
		
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<3; j++) {
				
				Arr[i][j] = (i+j);
			}
		}
		
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<3; j++) {
			
				System.out.println("-> " + (i+j+1) + ". Eleman : " + Arr[i][j] );
				
			}
		}
	}
	
}
