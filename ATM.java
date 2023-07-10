import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 1000.0;

        System.out.println("Welcome to the ATM!");

        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = input.nextDouble();
                    balance += depositAmount;
                    System.out.println("Deposit successful. Your new balance is: $" + balance);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = input.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds. Withdrawal failed.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. Your new balance is: $" + balance);
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
                    break;
            }
        }
    }
}
