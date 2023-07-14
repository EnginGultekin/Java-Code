import java.util.Arrays;

public class ArraysFill {
    public static void main(String[] args) {
        int[] list1 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(list1, 2);
        System.out.println(Arrays.toString(list1));

        int[] list2 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(list2, 2, 6, 7);
        System.out.println(Arrays.toString(list2));
    }
}


// ```fill()```

// Output
// [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
// [15, 1, 99, 7, 7, -22, 11, 2, -49, 52]