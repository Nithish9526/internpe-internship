import java.util.Scanner;

class GuessTheNumber {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100) + 1;

       
        int userGuess;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                hasGuessedCorrectly = true;
            } else if (userGuess < randomNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
        scanner.close();
    }
}