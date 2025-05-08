package simpleprojects.src;

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            System.out.print("Enter your move(rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();
    
            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("Invalid choice.");
            }
    
        computerChoice = choices[random.nextInt(3)];
    
        System.out.println("Your choice: " + playerChoice + "\nComputer's choice: " + computerChoice);
    
        if(computerChoice.equals(playerChoice)){
            System.out.println("************");
            System.out.println("It's a draw!");
            System.out.println("************");
        }
        else if((computerChoice.equals("paper") && playerChoice.equals("scissors")) ||
                (computerChoice.equals("rock") && playerChoice.equals("paper")) ||
                computerChoice.equals("scissors") && playerChoice.equals("rock"))
        {
            System.out.println("********");
            System.out.println("You win!");
            System.out.println("********");
        }
        else{
            System.out.println("*********");
            System.out.println("You lose!");
            System.out.println("*********");
        }
        System.out.print("Play again?(yes/no): ");
        
        playAgain = scanner.nextLine().toLowerCase();
        
        if (!playAgain.equals("yes") && !playAgain.equals("no")){
            System.out.println("Invalid choice, no more games");
            playAgain = "no";
        }
        }while(playAgain.equals("yes"));

}
}
