import java.util.Scanner;

// Rule enter 16 -->  Output: 16 11 6 1 -4 1 6 11 16
// Back to top when 0 or less and five-by-five less and more

public class RecursivePattern {
    public static void recursiveMethod(int number){

        if(number <= 0 ){
            System.out.print(number +" ");  // Second -4
            return;
        }

        System.out.print(number + " ");   // First Ex. n=16 -> 16 11 6 1
        recursiveMethod(number - 5);
        System.out.print(number + " ");   // Third 1 6 11 16
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        recursiveMethod(number);
        System.out.println();
    }
}
