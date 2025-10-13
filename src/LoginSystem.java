import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //My Arrays
        String[] usernames = new String[5];
        String[] passwords = new String[5];

        //Counter to keep track of registered users
        int userCount = 0;

        //Logic
        while(true){
            System.out.println("============= Login Page ===============");
            System.out.println("========================================");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println("========================================");
            System.out.print("Select if you want to Register or Login or Exit: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 1){
                System.out.println("Welcome to our Registration page.");

                if(userCount >= 5){
                    System.out.println("Sorry, maximum users registered");
                }else{
                    System.out.print("Create your username: ");
                    usernames[userCount] = scanner.nextLine();

                    System.out.print("Create your password: ");
                    passwords[userCount] = scanner.nextLine();

                    userCount++;

                    System.out.println("Registration was successful. You can now login.");
                }

            }else if(choice == 2){
                System.out.println("Enter your login details");

                if(userCount == 0){
                    System.out.println("No registered users found. Please start by creating your credentials first.");
                }else{
                    System.out.print("Enter your username: ");
                    String loginUsername = scanner.nextLine();

                    System.out.print("Enter your password: ");
                    String loginPassword = scanner.nextLine();

                    boolean loginSuccessful = false;

                    for(int i = 0; i < userCount; i++){
                        if(usernames[i].equals(loginUsername) && passwords[i].equals(loginPassword)){
                            loginSuccessful = true;
                            break;
                        }
                    }

                    if(loginSuccessful) {
                        System.out.println("✓ Login successful! Welcome back, " + loginUsername + "!");
                    } else {
                        System.out.println("✗ Invalid username or password. Please try again.");
                    }
                }
            }else{
                System.out.println("Thank you. Do come back😀");
                break;
            }

        }
    }
}
