import java.time.Year;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if(this.salary > 1000)
            return this.salary * 0.03;
        return  0;
    }

    double bonus(){
        if(this.workHours > 40){
            double extra = workHours - 40;
            return extra * 30;
        }

        return 0;
    }

    double raiseSalary(){
        int yearsWorked = Year.now().getValue() - hireYear;
        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    @Override
    public String toString() {
        return "Employee Information:\n" +
                "Name: " + name + "\n" +
                "Salary: " + salary + "\n" +
                "Work Hours: " + workHours + "\n" +
                "Hire Year: " + hireYear;
    }

    void printCalculations(){
        // Calculate tax amount
        System.out.println("Tax amount: " + this.tax());

        // Calculate bonus amount
        System.out.println("Bonus amount: " + this.bonus());

        // Increase salary based on years worked
        System.out.println("Salary Increase: " + this.raiseSalary());

        // Salary with Taxes and Bonuses
        double salaryTB = this.salary + this.bonus() - this.tax();
        System.out.println("Salary with Taxes and Bonuses: " + salaryTB);

        // Total Salary
        System.out.println("Total Salary: " + (salaryTB + this.raiseSalary()));
    }

}
