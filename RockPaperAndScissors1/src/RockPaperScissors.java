import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RockPaperScissors
{
    public static void main(String[] args)
    {
         Scanner scanner = new Scanner(System.in);


         final String Rock = "Rock";
         final String Paper = "Paper";
         final String Scissors = "Scissors";
         System.out.print("Chose [r]ock, [p]aper, or [s]cissors: ");
         String playerMove = scanner.nextLine();
         if(playerMove.equals("r") || playerMove.equals("rock"))
         {
             playerMove = Rock;
         }
         else if(playerMove.equals("p") || playerMove.equals("paper"))
         {
             playerMove = Paper;
         }
         else if(playerMove.equals("s") || playerMove.equals("scissors"))
         {
             playerMove = Scissors;
         }
         else
         {
             System.out.println("Invalid Input. Try Again...");
             return;
         }

        Random random = new Random();
         int computerRandomNumber = random.nextInt(4);
         String computerMove = "";
        if (computerRandomNumber == 1)
        {
            computerMove = Rock;
        }
        else if (computerRandomNumber == 2)
        {
            computerMove = Paper;
        }
        else if(computerRandomNumber == 3)
        {
            computerMove = Scissors;
        }
        else
        {
            System.out.println("Invalid Input. Try Again...");
            return;
        }

        System.out.printf("The computer chose %s.%n", computerMove);

         if((playerMove.equals(Rock) && computerMove.equals(Scissors)) ||
                 (playerMove.equals(Paper) && computerMove.equals(Rock)) ||
                 (playerMove.equals(Scissors) && computerMove.equals(Paper)))
         {
             System.out.println("You win.");
         }
         else if((playerMove.equals(Rock) && computerMove.equals(Rock)) ||
                (playerMove.equals(Paper) && computerMove.equals(Paper)) ||
                (playerMove.equals(Scissors) && computerMove.equals(Scissors)))
         {
             System.out.println("The game was a draw.");
         }
         else {
             System.out.println("You lose.");
         }

    }
}