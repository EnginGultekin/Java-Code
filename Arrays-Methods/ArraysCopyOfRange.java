import java.util.Arrays;

public class ArraysCopyOfRange {
    public static void main(String[] args) {
        int[] list = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        int[] copyArray = Arrays.copyOf(list, 3);
        System.out.println(Arrays.toString(copyArray));

        int[] copyOfRangeArray = Arrays.copyOfRange(list, 0,5);
        System.out.println(Arrays.toString(copyOfRangeArray));
    }
}


// ```copyOf() and copyOfRange() ```

// Output
// [6, 1, 55]
// [6, 1, 55, 21, 33]