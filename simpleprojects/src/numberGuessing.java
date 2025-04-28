package simpleprojects.src;
import java.util.*;

public class numberGuessing {
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number guessing game");
        System.out.printf("Guess a number between %d-%d: %n", min, max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Your guess is too low. Try again.");
            }
            else if(guess > randomNumber){
                System.out.println("Your guess is too high. Try again.");
            }
            else{
                System.out.println("Correct! The number was " + randomNumber);
                System.out.printf("Number of attempts: %d%n", attempts);
            }

        }while(guess != randomNumber);

        System.out.println("You have won");

    }
}
