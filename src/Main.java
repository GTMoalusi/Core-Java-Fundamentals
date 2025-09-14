import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {

        //Basic Calculator program.... lets get to it !!!

        //Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========Basic Calculator==========");

        //Prompt the user for input...
        System.out.print("Please enter your first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Please enter your second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Please select an operator (+, -, /, *, %): ");
        char operator = scanner.next().charAt(0);

        System.out.println("========================================");

        //Calculations

        if(operator == '+') {
            System.out.println("The sum of " + firstNumber + " " + operator + " " + secondNumber + " = " + (firstNumber + secondNumber));
        }else if(operator == '-') {
            System.out.println("The sum of " + firstNumber + " " + operator + " " + secondNumber + " = " + (firstNumber - secondNumber));
        }else if(operator == '/') {
            if(secondNumber != 0) {
                System.out.println("The sum of " + firstNumber + " " + operator + " " + secondNumber + " = " + (firstNumber / secondNumber));
            }else {
                System.out.println("Error you cannot divide by zero...");
            }
        }else if(operator == '*') {
            System.out.println("The sum of " + firstNumber + " " + operator + " " + secondNumber + " = " + (firstNumber * secondNumber));
        }else if(operator == '%') {
            System.out.println("The sum of " + firstNumber + " " + operator + " " + secondNumber + " = " + (firstNumber % secondNumber));
        }else {
            System.out.println("Please enter a valid operator");
        }
    }
}