import java.util.Scanner;

public class ChineseZodiac2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        String[] zodiacSigns = {
                "Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"
        };

        int zodiacIndex = (birthYear - 1900) % 12;

        System.out.println("Your Chinese Zodiac Sign is: " + zodiacSigns[zodiacIndex]);

        input.close();
    }
}
