import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName = "Luganhan", password = "java";
        String userCont, passCont;
        boolean ok = true, again = false;

        System.out.print("Enter username: ");
        userCont = input.nextLine();

        System.out.print("Enter password: ");
        passCont = input.nextLine();

        while(ok){

            if(again){
                System.out.print("Enter username: ");
                userCont = input.nextLine();

                System.out.print("Enter password: ");
                passCont = input.nextLine();
                again = false;
            }

            if(!userCont.equals(userName)){
                System.out.println("Username is wrong, please try again.");
            } else if(!passCont.equals(password)){
                System.out.println("Password is wrong, please try again.");
            } else {
                System.out.println("Login successful");
                ok = false;
            }

            if(ok){
                System.out.println("Would you like to Reset Information");
                System.out.println("1. Change Username");
                System.out.println("2. Change Password ");
                System.out.println("3. Try Again");
                System.out.println("4. Exit");

                System.out.print("Make your choice (1-4): ");
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter new username: ");
                        userCont = input.nextLine();
                        if(userCont.equals(userName)){
                            System.out.println("Your new password cannot be the same as your old password");
                            ok = false;
                        }
                        else {
                            userName = userCont;
                        }
                        break;
                    case 2:
                        System.out.print("Enter new password: ");
                        passCont = input.nextLine();
                        if(passCont.equals(password)){
                            System.out.println("Your new password cannot be the same as your old password");
                            ok = false;
                        }
                        else {
                            password = passCont;
                        }
                        break;
                    case 3:
                        break;
                    case 4:
                        ok = false;
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        ok = false;
                        break;
                }
                again = true;
            }
        }
    }
}
