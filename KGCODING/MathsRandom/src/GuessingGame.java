import java.util.Scanner;

public class GuessingGame {

    private int random;

    // Constructor
    GuessingGame() {
        random = (int)(Math.random() * 100) + 1;  // Random number from 1 to 100
    }

    /**
     * @param gn is the number guessed by player.
     * @return
     * - 0 : if the guess is correct
     * - <0 : if the guess is smaller
     * - >0 : if the guess is higher
     */
    int Guess(int gn) {
        return gn - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessingGame game = new GuessingGame();

        System.out.println("Welcome to the Guessing Game! Guess the number between 1 - 100!");

        int guess;
        int result;
        do {
            System.out.print("Guess the number: ");
            guess = input.nextInt();
            result = game.Guess(guess);

            if (result < 0) {
                System.out.println("Too low!");
            } else if (result > 0) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed it.");
            }
        } while (result != 0);
    }
}