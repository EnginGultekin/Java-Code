public class FrequencyCounter {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, -1, 10, 10, 20, 5, 20, -1};
        int[] frequency = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            frequency[i] = -1;
        }

        for(int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j]){
                    count++;
                    frequency[j] = 0;
                }
            }
            if(frequency[i] != 0){
                frequency[i] = count;
            }
        }

        System.out.println("Duplicate Number");
        for(int i = 0; i < array.length; i++){
            if(frequency[i] != 0){
                System.out.println("The number " + array[i] +
                        " was repeated " + frequency[i] + " times.");
            }
        }

    }
}
