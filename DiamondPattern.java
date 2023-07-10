import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows (odd number): ");
        int rows = input.nextInt();

        int midRow = rows / 2;
        int spaceCount = midRow;

        // Upper half of the diamond
        for(int i = 0; i <= midRow; i++){
            for(int j = 0; j < spaceCount; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
            spaceCount--;
        }

        // Lower half of the diamond
        spaceCount = 1;
        for(int i = midRow - 1; i >= 0; i--){
            for(int j = 0; j < spaceCount; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
            spaceCount++;
        }
    }
}
