import java.util.Arrays;

public class FindDuplicatePairs {

    static boolean isFind(int[] arr, int value){
        for(int item : arr){
            if(item == value) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 8, 9, 8, 8, 2, 6, 10};
        int[] duplicate = new int[list.length];
        int index = 0;

        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length; j++){
                if(i != j && list[i] == list[j]){
                    if(list[i] % 2 == 0 && !isFind(duplicate, list[i])){
                        duplicate[index++] = list[i];
                        break;
                    }
                }
            }
        }

        for(int value : duplicate){
            if(value != 0)
                System.out.println(value);
        }


    }
}
