package bullscows;
import java.util.Scanner;

public class Main {
    public static String generateSecretCode(int n) {
        long pseudoRandomNumber = System.nanoTime();
        String random = "" + pseudoRandomNumber;
        boolean[] digits = new boolean[10];
        StringBuilder result = new StringBuilder();
        for (int i = random.length() - 1, j = 0; i >= 0 && j < n; i--) {
            int d = Character.getNumericValue(random.charAt(i));
            if (j == 0 && d == 0) {  // avoid placing zero as the secret number's most significant digit
                continue;
            }
            if (!digits[d]) {
                digits[d] = true;
                result.append(random.charAt(i));
                j++;
            }
        }
        return result.toString();
    }

    public static boolean evaluate(String secretCode, String input) {
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < secretCode.length(); i++) {
            if (secretCode.charAt(i) == input.charAt(i)) {
                bulls++;
            } else if (secretCode.indexOf(input.charAt(i)) > -1) {
                cows++;
            }
        }
        System.out.print("Grade: ");
        System.out.print(bulls > 0 ? bulls + " bull(s)" : "");
        System.out.print(cows > 0 ? bulls > 0 ? " and " : "" + cows + " cows(s)" : "");
        System.out.print(bulls == 0 && cows == 0 ? "None." : ".");
        return bulls == secretCode.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the secret code's length:");
        int n = scanner.nextInt();
        String secretCode = generateSecretCode(n);
        if (secretCode.length() != n) {
            System.out.println("Error generating secret code.");
            return;
        }
        System.out.println("Okay, let's start a game!");
        int turn = 0;
        boolean guessedCorrect = false;
        while (!guessedCorrect) {
            System.out.println("Turn " + ++turn + ":");
            String input = scanner.next();
            guessedCorrect = evaluate(secretCode, input);
        }
        System.out.println("Congratulations! You guessed the secret code.");
    }
}