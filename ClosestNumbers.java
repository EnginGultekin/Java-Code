import java.util.Arrays;

public class ClosestNumbers {
    public static void main(String[] args) {
        int[] list =  {15,12,788,1,-1,-778,2,0};

        Arrays.sort(list);  // {-788, -1, 0, 1, 2, 12, 15, 788}
        int index = Arrays.binarySearch(list, 8);

        if (index >= 0) {
            System.out.println("Closest Smaller Number: " + list[index - 1]);
            System.out.println("Closest Greater Number: " + list[index + 1]);
        } else {
            /*
            If the target number is not found in the array, the negative value obtained as a result of
            Arrays.binarySearch determines the position where the nearest small and nearest
            large numbers will be placed, and the numbers in these positions are printed on the screen.
             */
            int insertionPoint = -index - 1;
            if (insertionPoint > 0) {
                System.out.println("Closest Smaller Number: " + list[insertionPoint - 1]);
            }
            if (insertionPoint < list.length) {
                System.out.println("Closest Greater Number: " + list[insertionPoint]);
            }
        }

    }
}
