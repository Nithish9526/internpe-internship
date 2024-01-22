import java.util.Random;
import java.util.Scanner;

 class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Enter your choice (rock, paper, scissors) or 'exit' to end the game:");
            String playerChoice = scanner.nextLine().toLowerCase();

            if (playerChoice.equals("exit")) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }

            if (!isValidChoice(playerChoice)) {
                System.out.println("Invalid choice. Please enter rock, paper, or scissors.");
                continue;
            }

            int computerChoice = random.nextInt(3); // 0 for rock, 1 for paper, 2 for scissors

            System.out.println("Computer choice: " + getChoiceName(computerChoice));
            System.out.println("Your choice: " + playerChoice);

            String result = determineWinner(playerChoice, computerChoice);
            System.out.println(result);
        }

        scanner.close();
    }

    private static boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

    private static String getChoiceName(int choice) {
        switch (choice) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return "Invalid Choice";
        }
    }

    private static String determineWinner(String playerChoice, int computerChoice) {
        String computerChoiceName = getChoiceName(computerChoice);

        if (playerChoice.equals(computerChoiceName.toLowerCase())) {
            return "It's a tie!";
        } else if (
            (playerChoice.equals("rock") && computerChoiceName.equals("Scissors")) ||
            (playerChoice.equals("paper") && computerChoiceName.equals("Rock")) ||
            (playerChoice.equals("scissors") && computerChoiceName.equals("Paper"))
        ) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}
