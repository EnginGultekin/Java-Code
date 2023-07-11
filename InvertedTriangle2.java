import java.util.Scanner;

public class InvertedTriangle2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        int spaceCount = 0;

        for (int i = rows; i >= 1; i--) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            spaceCount++;
        }
    }
}
