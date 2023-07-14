public class HarmonicMean {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 8, 10 };

        double harmonicMean = calculateHarmonicMean(numbers);
        System.out.println("Harmonic Mean: " + harmonicMean);
    }
    public static double calculateHarmonicMean(int[] numbers) {
        double sum = 0;

        for (int number : numbers) {
            sum += 1.0 / number;
        }

        return numbers.length / sum;
    }
}
