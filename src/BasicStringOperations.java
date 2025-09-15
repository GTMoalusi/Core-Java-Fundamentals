public class BasicStringOperations {
    public static void main(String[] args) {
        //This is a Java Common String operations
        /*
        * 1. String Declaration
        * 2. Concatenation
        * 3. String length retrieval
        * 4. Accessing certain characters
        * 5. String comparison
        * 6. Substring extraction
        * 7. Check whether string is empty or not*/

        //Lets get to it.

        //String Declaration and Initialization
        String firstName = "Thabang";
        String lastName = "Moalusi";
        String message;

        //String Concatenation
        message = firstName + " " + lastName;
        System.out.println("Your message is: " + message);

        //String length retrieval
        int messageLength = message.length();
        System.out.println("Your message length is: " + messageLength); //Remember we also account for empty spaces in between.

        //Accessing characters of the string.
        char firstLetter = firstName.charAt(0); //This should print 'T'
        char lastLetter = firstName.charAt(firstName.length() - 1);
        System.out.println(lastLetter); //This should output 'g'

        //String comparison
        String newName = "thabang"; //take note of first letter, Java is case sensitive
        boolean isStringTheSameCaseSensitive = newName.equals(firstLetter);
        System.out.println(isStringTheSameCaseSensitive); //output is false because in Java 't' and 'T' differ.
        boolean isStringTheSameCaseNotSensitive = newName.equalsIgnoreCase(firstName);
        System.out.println(isStringTheSameCaseNotSensitive); //output is true because I told it to ignore case sensitivity

        //Substring extraction
        String originalString = "Hello World";
        String sub1 = originalString.substring(6,originalString.length());
        System.out.println(sub1);

        //Check for emptiness
        String word = "Thabang"; //Empty string
        boolean isEmpty = word.isEmpty();
        System.out.println(isEmpty); //output should be false....

        //The end... So muuch more can be done with Strings.....
    }
}
