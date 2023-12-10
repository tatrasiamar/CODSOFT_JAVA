import java.util.Scanner;
import java.util.Random;

public class numbergame {
    private static final int min_range = 1;
    private static final int max_range = 100;
    private static final int max_attempts = 5;
    private static final int max_rounds = 3;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int totalScore = 0;

        System.out.println("Number Guessing Game");
        System.out.println("Total Number of Rounds: 3");
        System.out.println("Attempts To Guess Number In Each Round: 10\n");

        for (int i = 1; i <= max_rounds; i++) {
            int number = random.nextInt(max_range) + min_range;
            int attempts = 0;

            System.out.printf("Round %d: Guess the number between %d and %d in %d attempts.\n", i, min_range, max_range,
                    max_attempts);

            while (attempts < max_attempts) {
                System.out.println("Enter your Guess:");
                int guessNumber = sc.nextInt();
                attempts = attempts + 1;

                if (guessNumber == number) {
                    int score = max_attempts - attempts;
                    System.out.printf("Number Guessed Successfully. Attempts = %d. Round score = %d\n", attempts, score);
                    totalScore += score;
                    break;
                } else if (guessNumber < number) {
                    System.out.printf("The number is greater than %d. Attempts Left = %d.\n", guessNumber,
                            max_attempts - attempts);
                } else if (guessNumber > number) {
                    System.out.printf("The number is less than %d. Attempts left = %d.\n", guessNumber,
                            max_attempts - attempts);
                }
            }

            if (attempts == max_attempts) {
                System.err.printf("\n Round = %d\n", i);
                System.out.printf("Attempts = 0");
                System.out.printf("The random number is: %d\n\n", number);
            }
        }
        System.out.printf("Game over. Total score = %d\n", totalScore);
        sc.close();
    }
}