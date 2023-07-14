import java.util.Arrays;
import java.util.Scanner;

public class SortingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        System.out.println("Enter the elements of the array: ");
        int[] array = new int[size];

        for(int i = 0;  i < size; i++){
            System.out.print((i+1) + ". Element : ");
            array[i] = input.nextInt();
        }

        Arrays.sort(array);
        System.out.print("Sorted Array : ");
        for(int item : array){
            System.out.print(item + " ");
        }
    }
}
