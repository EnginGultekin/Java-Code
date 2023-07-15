import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rowNumber = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int ColNumber = scanner.nextInt();

        MineSweeper mineGame = new MineSweeper(rowNumber,ColNumber);
        mineGame.play();
    }
}