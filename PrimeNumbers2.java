public class PrimeNumbers2 {

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");

        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(number);
        }
    }
}