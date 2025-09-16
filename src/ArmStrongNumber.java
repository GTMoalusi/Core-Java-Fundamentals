public class ArmStrongNumber {
    public static void main(String[] args) {
        //Java program to check ArmStrong Number between two Integers

        //Variable Declaration and Initialization
        int lowerNumber = 100;
        int upperNumber = 500;

        System.out.println("ArmStrong numbers between " + lowerNumber + " and " + upperNumber + ":");
        
        //Loop around the given range
        for (int i = lowerNumber; i <= upperNumber; i++){
            //Store value of i at any given point
            int originalNumber = i;
            //Get the number of digits making up the value of i at any given point
            int numberOfDigits = String.valueOf(originalNumber).length();

            //Declaration and Initialization of sum
            int sum = 0;
            int tempVar = originalNumber;
            
            while(tempVar > 0){
                //Assign a variable that extract one digit from the original and do calc with it.
                int singleDigit = tempVar % 10; //Get the last digit & store it in singleDigit variable
                //calculation for value of sum
                sum += (int) Math.pow(singleDigit, numberOfDigits);
                tempVar /= 10; //Remove the last digit
            }
            
            //Check if sum is equal to originalNumber
            if(sum == originalNumber){
                System.out.println(originalNumber);
            }
        }
    }
}


