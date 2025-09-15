public class ArmStrongNumber {

    public static void main(String[] args) {

        int lowerNumber = 100;
        int higherNumber = 200;

        System.out.println("ArmStrong numbers between " + lowerNumber + " and " + higherNumber + ":");

        for (int i = lowerNumber; i <= higherNumber; i++){
            //int originalNumber = i;
            int numberOfDigits = String.valueOf(i).length();
            int sum = 0;

            int temp = i;
            while(temp > 0){
                int lastDigit = temp % 10;
                sum += (int) Math.pow(lastDigit, numberOfDigits);
                temp /= 10;
            }

            if(sum == i){
                System.out.println(i);
            }
        }
    }
}
