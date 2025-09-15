import java.util.Scanner;

public class isPalindromeChecker {
    public static void main(String[] args) {
        //This program checks whether a String is a Palindrome or not...
        //Let's get to it.

        /*
        * 1. String Declaration
        * 2. Convert String to lower Case
        * 3. Create a String builder object
        * 4. Reverse the string
        * 5. Compare the reversed string with original string*/

        Scanner scanner = new Scanner(System.in);

        //Declaration of string
        System.out.print("Please enter your string: ");
        String word = scanner.nextLine();

        //Convert string to lower case
        word = word.toLowerCase();

        //Create a String builder object
        StringBuilder reversedWord = new StringBuilder(word);

        //Reverse the string
        reversedWord.reverse();

        //Compare the strings
        if (word.contentEquals(reversedWord)){
            System.out.println(word + " is a Palindrome.");
        }else{
            System.out.println(word + " is not a Palindrome.");
        }

        scanner.close();
    }
}
