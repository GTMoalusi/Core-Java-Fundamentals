import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        //Login System
        Scanner scanner = new Scanner(System.in);

        //Arrays
        String[] usernames = new String[5];
        String[] passwords = new String[5];

        int userCount = 0; //this is the counter we will use to record how many users we have...

        //Flow Control
        while(true){
            //My menu
            displayMenu();

            //Ask the user for their selection.
            System.out.print("Select if you want to register or login or exit: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1){ //This is option 1 Registration
                userCount = registerUser(scanner,usernames, passwords, userCount);

            } else if (choice == 2) { //This is option 2. Login
                loginUser(scanner, usernames, passwords, userCount);
            }else {
                System.out.println("Thank you and please do come back.🙂"); //This is option 3 Exit.
                break;
            }
        }
        scanner.close(); //Always remember to close your scanner...
    }

    public static void displayMenu(){
        System.out.println("============= Login Page ================");
        System.out.println("========================================="); //I want to make my menu look clean.
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.println("=========================================");
    }

    public static int registerUser(Scanner scanner, String[] usernames, String[] passwords, int userCount){
        System.out.println("Welcome to the registration page.");

        //We have to always check if we have space for a new user in our Array...
        if(userCount >= 5){
            System.out.println("Sorry, maximum users registered.");
        }else {

            System.out.print("Create your username: ");
            String newUser = scanner.nextLine();

            System.out.print("Create your password: ");
            String newPassword = scanner.nextLine();

            //Okay this is where I want to call my method/function.... We need to validate before we store in the Array...
            if (passwordValidator(newPassword)) {

                usernames[userCount] = newUser;
                passwords[userCount] = newPassword;

                userCount++;
                System.out.println("Registration was successful. You can now login.");
            } else {
                System.out.println("Registration is not successful. Please try again.");
            }
        }

        return userCount;
    }

    public static void loginUser(Scanner scanner, String[] usernames, String[] passwords, int userCount){
        System.out.println("Enter your login details.");

        //before someone logs in, we must always check if our Array actually contains any value inside...
        if(userCount == 0){
            System.out.println("No registered user found. Please start by registering first.");
        }else{
            System.out.print("Enter your username: ");
            String loginUsername = scanner.nextLine();

            System.out.print("Enter your password: ");
            String loginPassword = scanner.nextLine();

            boolean loginSuccessful = false;

            //I now want to check the users credentials against what's already stored inside the Array...
            for(int i = 0; i < userCount; i++){
                if(usernames[i].equals(loginUsername) && passwords[i].equals(loginPassword)){
                    loginSuccessful = true;
                    break;
                }
            }

            //Check if login is successful
            if(loginSuccessful){
                System.out.println("💪🏽Login was successful. Welcome back, " + loginUsername + "!!!");
            }else{
                System.out.println("❌ Invalid username or password. Please try again!!!");
            }
        }
    }

    public static boolean passwordValidator(String password){

        /*I want to check for the length of my password, whether it contains upper and lower cases,
        whether it contains digits or not and whether it has empty spaces
         */

        //Declarations
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasEmptySpace = true;
        boolean passwordLength = (password.length() >= 8);

        //Need to now set up my checks here...
        for(int i = 0; i < password.length(); i++){

            if(Character.isUpperCase(password.charAt(i))){
                hasUppercase = true;
            }

            if(Character.isLowerCase(password.charAt(i))){
                hasLowercase = true;
            }

            if(Character.isDigit(password.charAt(i))){
                hasDigit = true;
            }


            if(password.charAt(i) == ' '){
                hasEmptySpace = false;
            }
        }

        //Flow control
        if(passwordLength){
            System.out.println("✔︎Password length passed.");
        }else{
            System.out.println("✕Password length must be more than 8 characters long");
        }

        if(hasUppercase){
            System.out.println("✔︎Uppercase check passed.");
        }else{
            System.out.println("✕Password must contain an uppercase");
        }

        if(hasLowercase){
            System.out.println("✔︎Lowercase check passed.");
        }else{
            System.out.println("✕Password must contain a lowercase");
        }

        if(hasDigit){
            System.out.println("✔︎Digit check passed");
        }else{
            System.out.println("✕Password must contain a digit");
        }

        if(hasEmptySpace){
            System.out.println("✔︎Empty space check passed");
        }else{
            System.out.println("✕Password must not contain empty space.");
        }

        //The reason for my return, is that I want it to return false if any of these checks is not true...
        return hasUppercase && hasLowercase && hasEmptySpace && hasDigit && passwordLength;
    }
}
