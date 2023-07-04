import java.util.Scanner;

// VAT = KDV
public class CalculateVat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variable names
        double amount, vatRate, vatAmount;

        System.out.print("Enter the fee amount: ");
        amount = input.nextInt();
        vatRate = amount >= 1000 ? 0.08 : 0.18;
        vatAmount = amount * vatRate;

        System.out.println("Total amount with vat(kdv): " + (vatAmount + amount) );
    }
}
