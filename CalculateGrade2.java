import java.util.Scanner;

public class CalculateGrade2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // variable names
        int math, phy, che, turk, music, count = 0;
        double result = 0;

        System.out.print("Enter your math grade: ");
        math = input.nextInt();
        if(math >= 0 && math <= 100){
            result = math;
            count++;
        }

        System.out.print("Enter your physical grade: ");
        phy = input.nextInt();
        if(phy >= 0 && phy <= 100){
            result += phy;
            count++;
        }

        System.out.print("Enter your chemical grade: ");
        che = input.nextInt();
        if(che >= 0 && che <= 100){
            result += che;
            count++;
        }

        System.out.print("Enter your Turkish grade: ");
        turk = input.nextInt();
        if(turk >= 0 && turk <= 100){
            result += turk;
            count++;
        }

        System.out.print("Enter your music grade: ");
        music = input.nextInt();
        if(music >= 0 && music <= 100){
            result += music;
            count++;
        }

        result /= count;

        System.out.println("Not aralığı 0 - 100 arasında olan " + count + " ders işleme alınmıştır");
        System.out.println("Your grade point average: " + result);
        System.out.print(result > 55 ? "Passed :)" : "Fail :(");

    }
}
