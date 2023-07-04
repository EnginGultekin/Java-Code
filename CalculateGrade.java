import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variable names
        int math, phy, che, turk, his, music;
        double result;

        System.out.print("Enter your math grade: ");
        math = input.nextInt();

        System.out.print("Enter your physical grade: ");
        phy = input.nextInt();

        System.out.print("Enter your chemical grade: ");
        che = input.nextInt();

        System.out.print("Enter your Turkish grade: ");
        turk = input.nextInt();

        System.out.print("Enter your history grade: ");
        his = input.nextInt();

        System.out.print("Enter your music grade: ");
        music = input.nextInt();

        result = (double) (math + phy + che + turk + his + music) / 6;
        System.out.println("Your grade point average: " + result);

        System.out.print(result > 60 ? "Passed :)" : "Fail :(8");

    }
}
