import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Rock-Paper-Scissors Series!");
        System.out.println("The first to win 3 games out of 5 will be the series winner.");
        System.out.println("Enter your choice: Rock, Paper, or Scissors. To exit the game, type Exit.");

        int userWins = 0;
        int computerWins = 0;

        while (userWins < 3 && computerWins < 3) {
            System.out.print("Your choice: ");
            String userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.equals("exit")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid input. Please enter Rock, Paper, or Scissors.");
                continue;
            }

            int computerChoiceIndex = random.nextInt(3); // 0 = Rock, 1 = Paper, 2 = Scissors
            String computerChoice = switch (computerChoiceIndex) {
                case 0 -> "rock";
                case 1 -> "paper";
                case 2 -> "scissors";
                default -> "";
            };

            System.out.println("Computer chose: " + computerChoice.substring(0, 1).toUpperCase() + computerChoice.substring(1));

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win this round!");
                userWins++;
            } else {
                System.out.println("Computer wins this round!");
                computerWins++;
            }

            System.out.println("Score: You " + userWins + " - " + computerWins + " Computer");
            System.out.println();
        }

        if (userWins == 3) {
            System.out.println("Congratulations! You are the series winner!");
        } else if (computerWins == 3) {
            System.out.println("Computer wins the series. Better luck next time!");
        }

        scanner.close();
    }
}