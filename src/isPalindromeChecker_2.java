public class isPalindromeChecker_2 {

    //If you are asked to check whether a word is a Palindrome string or not and it is stated to use a function/method
    //How would you solve it? ... Let's get to it.

    public static boolean isPalindrome(String word){
        // I am going to use a two pointer method

        //My pointers i and j, i will start from the front and j will start from the back...simple right.
        int i = 0; // front
        int j = word.length() - 1; // back

        //Since i will be going up and j is dropping down, for as long as they are not on the same point at any time, the
        //while loop will continue looping.
        while (i < j){
            if(word.charAt(i) != word.charAt(j)){
                //System.out.println(word + " is not a Palindrome String.");
                return false;
            }
            i++; //I am incrementing so that it goes to the next letter and compare with j
            j--; //I am decrementing so that it goes to the letter before current and compare with i
        }

        return true;
    }

    public static void main(String[] args) {

        //String declaration and Initialization
        String word1 = "RaCECAr";
        String word2 = "MADam";

        //Convert to lower case... Java is highly case-sensitive
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        //If Statement to check our strings is whether they are Palindrome or not.
        if(isPalindrome(word1)){
            System.out.println(word1 + " is a Palindrome String.");
        }else{
            System.out.println(word1 + " is not a Palindrome String.");
        }

        if(isPalindrome(word2)){
            System.out.println(word2 + " is a Palindrome String.");
        }else{
            System.out.println(word2 + " is not a Palindrome String.");
        }
    }
}
