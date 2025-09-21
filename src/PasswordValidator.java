import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        int passwordLength = password.length();
        boolean isValidLength = (passwordLength >= 8);

        // We'll add other checks here
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasNoSpaces = true;

        if (isValidLength) {
            System.out.println("✓ Length check passed");
        } else {
            System.out.println("✗ Password must be at least 8 characters long");
        }

        for(int i = 0; i < passwordLength; i++){
            char letter = password.charAt(i);

            // Check if this character is uppercase
            if(Character.isUpperCase(letter)){
                hasUppercase = true;  // Just set the variable, don't print yet
            }

            // Check if this character is lowercase
            if(Character.isLowerCase(letter)){
                hasLowercase = true;  // Just set the variable, don't print yet
            }

            // Check if this character is a digit
            if(Character.isDigit(letter)){
                hasDigit = true;  // Just set the variable, don't print yet
            }

            // Check if this character is a space
            if(letter == ' '){
                hasNoSpaces = false;  // Set to false because we found a space
            }
        }

        // NOW print the results after checking all characters

        if(hasUppercase){
            System.out.println("✓ Uppercase check passed");
        }else{
            System.out.println("✗ Password must contain at least one uppercase character");
        }

        if(hasLowercase){
            System.out.println("✓ Lowercase check passed");
        }else{
            System.out.println("✗ Password must contain at least one lowercase character");
        }

        if(hasDigit){
            System.out.println("✓ Digit check passed");
        }else{
            System.out.println("✗ Password must contain at least one digit");
        }

        if(hasNoSpaces){
            System.out.println("✓ No spaces check passed");
        }else{
            System.out.println("✗ Password must not contain spaces");
        }

        if (hasUppercase && hasLowercase && hasDigit && hasNoSpaces && isValidLength){
            System.out.println("✓ Access granted");
        }else {
            System.out.println("✕ Access not granted");
        }
        // Add similar if-else blocks for hasLowercase, hasDigit, and hasNoSpaces Can you complete the rest of the print statements following this pattern?

        scanner.close();
    }
}
