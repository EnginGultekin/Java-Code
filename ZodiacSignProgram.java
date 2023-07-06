import java.util.Scanner;

public class ZodiacSignProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month of your birth (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the day of your birth (1-31): ");
        int day = input.nextInt();

        String zodiacSign = "";

        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            zodiacSign = "Aquarius";
        } else if ((month == 2) || (month == 3 && day <= 20)) {
            zodiacSign = "Pisces";
        } else if ((month == 3) || (month == 4 && day <= 19)) {
            zodiacSign = "Aries";
        } else if ((month == 4) || (month == 5 && day <= 20)) {
            zodiacSign = "Taurus";
        } else if ((month == 5) || (month == 6 && day <= 20)) {
            zodiacSign = "Gemini";
        } else if ((month == 6) || (month == 7 && day <= 22)) {
            zodiacSign = "Cancer";
        } else if ((month == 7) || (month == 8 && day <= 22)) {
            zodiacSign = "Leo";
        } else if ((month == 8) || (month == 9 && day <= 22)) {
            zodiacSign = "Virgo";
        } else if ((month == 9) || (month == 10 && day <= 22)) {
            zodiacSign = "Libra";
        } else if ((month == 10) || (month == 11 && day <= 21)) {
            zodiacSign = "Scorpio";
        } else if ((month == 11) || (month == 12 && day <= 21)) {
            zodiacSign = "Sagittarius";
        } else if ((month == 12) || (month == 1)) {
            zodiacSign = "Capricorn";
        } else {
            System.out.println("Invalid date value!");
            System.exit(0);
        }

        System.out.println("Your zodiac sign is: " + zodiacSign);

        input.close();
    }
}