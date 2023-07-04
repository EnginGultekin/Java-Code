import java.util.Scanner;

public class GroceryCashier {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float pear = 2.14F, apple = 3.67F, tomatoes = 1.11F, banana = 0.95F, aubergine = 5.00F;
        float total, kilo;

        System.out.print("How Many Kilos of Pears: ");
        kilo = input.nextFloat();
        total = kilo * pear;

        System.out.print("How Many Kilos of Apple: ");
        kilo = input.nextFloat();
        total += kilo * apple;

        System.out.print("How Many Kilos of Tomatoes: ");
        kilo = input.nextFloat();
        total += kilo * tomatoes;

        System.out.print("How Many Kilos of Banana: ");
        kilo = input.nextFloat();
        total += kilo * banana;

        System.out.print("How Many Kilos of Aubergine: ");
        kilo = input.nextFloat();
        total += kilo * aubergine;

        System.out.print("Total amount: " + total);
    }
}
