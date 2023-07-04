import java.util.Scanner;

// If we want, we can write this program much shorter, but we wanted to do it over u.

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int edge1, edge2, edge3;
        double area, powerArea, perimeter, u;

        System.out.print("Enter the 1st side of the triangle: ");
        edge1 = input.nextInt();

        System.out.print("Enter the 2nd side of the triangle: ");
        edge2 = input.nextInt();

        System.out.print("Enter the 3rd side of the triangle: ");
        edge3 = input.nextInt();

        u = (double) (edge1 + edge2 + edge3) / 2;
        powerArea = u * (u - edge1) * (u - edge2) * (u - edge3);

        if(powerArea > 0){
            perimeter = 2 * u;
            area =  Math.sqrt(powerArea);

            System.out.println("Perimeter of triangle: " + perimeter);
            System.out.println("Area of triangle: " + Math.floor(area));
        }
        else {
            System.out.println("Any triangle with these sides cannot be formed!");
        }
    }
}
