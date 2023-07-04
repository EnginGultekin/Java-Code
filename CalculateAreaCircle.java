import java.util.Scanner;


public class CalculateAreaCircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int rad, angle;
        double area,  pi = 3.14;

        System.out.print("Enter the Radius: ");
        rad = input.nextInt();

        System.out.print("Enter Angle: ");
        angle = input.nextInt();

        area = (pi * (rad * rad) * angle) / 360;
        System.out.println("The Area of Circle: " + area);

    }
}
