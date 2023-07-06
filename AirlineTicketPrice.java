import java.util.Scanner;

public class AirlineTicketPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distance, age, travelType;
        double totalPrice, unitPrice = 0.10;

        System.out.print("Enter the distance (KM): ");
        distance = input.nextInt();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Select the travel type (1 - One-way, 2 - Round-trip): ");
        travelType = input.nextInt();

        // Error checking for invalid input
        if (distance <= 0 || age <= 0 || (travelType != 1 && travelType != 2)) {
            System.out.println("Invalid Data Entry!");
            System.exit(0);
        }

        totalPrice = distance * unitPrice;

        // Applying discounts in ORDER
        if (age < 12) {
            totalPrice *= 0.5; // 50% discount
        } else if (age <= 24) {
            totalPrice *= 0.9; // 10% discount
        } else if (age > 65) {
            totalPrice *= 0.7; // 30% discount
        }

        if (travelType == 2) {
            totalPrice *= 0.8; // 20% discount
            totalPrice *= 2; // Round-trip total 2 tickets
        }

        System.out.println("Total Ticket Price: " + totalPrice + " $");
    }
}
