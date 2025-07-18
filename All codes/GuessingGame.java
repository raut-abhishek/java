import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1; // Random number between 1 and 100
        int guess;
        int attempts = 0;

        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You guessed the number in " + attempts + " tries.");
            }
        } while (guess != numberToGuess);

        sc.close();
    }
}

