// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Create an instance of Employees
        Employee emp1 = new Employee("Frank", 11100, 52, 2001);
        Employee emp2 = new Employee("David", 15000, 36, 2018);

        // Print employee information
        System.out.println(emp1);
        System.out.println("*--------------------*");

        // Prints all calculations
        emp1.printCalculations();

        System.out.println("\n");

        System.out.println(emp2);
        System.out.println("*--------------------*");
        emp2.printCalculations();

    }
}