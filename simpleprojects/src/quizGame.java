package simpleprojects.src;
import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) {
    String [] questions = {"In oop, which concept allows a class object to be used inside another class?",
    "In OOP, which of these helps the compiler process objects differently based on their data type or class?",
    "Which OOP concept allows a child class to provide a specific implementation of a method already defined in its parent class?",
    "Which of these is not a benefit of using encapsulation in OOP?",
    "Which keyword is used in Java to create a subclass?"};

    String[][] options = {{"1. Inheritance", "2. Polymorphism", "3. Composition", "4. Abstraction"},
                        {"1. Inheritance", "2. Polymorphism", "3. Abstraction", "4. Encapsulation"}, 
                        {"1. Inheritance", "2. Abstraction", "3. Polymorphism", "4. Method Overriding"},
                        {"1. Data hiding", "2. Code duplication", "3. Increased modularity", "4. Better control over data"},
                        {"1. inherit", "2. implements", "3. extends", "4. sub"}};

    int answers[] = {3, 2, 4, 2, 3};
    int score = 0;
    int guess;

    Scanner scanner = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("Welcome to the Java Quiz Game");
        System.out.println("*****************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }
        }
    // QUESTION (LOOP)
    // LIST OPTIONS
    // GET ANSWER
    // CHECK GUESS
    // DISPLAY SCORE
    scanner.close();
    }
}
