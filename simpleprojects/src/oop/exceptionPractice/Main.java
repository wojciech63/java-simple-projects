package simpleprojects.src.oop.exceptionPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
        } catch (InputMismatchException e2) {
            System.out.println("You entered an invalid character");
        } catch (Exception all) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("This always executes");
        }

    }
}
