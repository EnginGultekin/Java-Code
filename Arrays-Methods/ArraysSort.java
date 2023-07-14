import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[] list = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}


// ```sort()```

// Output
// [-321, -21, -11, 1, 2, 6, 21, 27, 33, 55]