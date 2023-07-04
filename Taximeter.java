import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double km, perKm = 2.20, startPrice = 10, total;

        System.out.print("Enter the distance traveled in km: ");
        km = input.nextDouble();

        total = startPrice + (km * perKm);

        total = (total < 20) ? 20 : total;
        System.out.println("Total Amount: " + Math.round(total) + " £");
    }
}
