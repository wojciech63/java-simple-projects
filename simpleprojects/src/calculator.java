package simpleprojects.src;
import java.util.Scanner;

import javax.xml.validation.Validator;

public class calculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("What operation do you want to perform? (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;

            case '/' ->    {if (num2 == 0){
                System.out.println("Cannot divide by zero");
                validOperation = false;
            }
            else{
                result = num1/num2;
            }}

            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.err.println("Invalid operator!");
                validOperation = false;
            }
        }

        if (validOperation){
        System.out.println(result);
        };
    }
}
