import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 5361;
        int guess, tries = 0;
        final Scanner scanner = new Scanner(System.in);
        do {
            tries++;
            guess = scanner.nextInt();
            if (guess < number) {
                System.out.println("Bigger!");
            } else if (guess > number) {
                System.out.println("Smaller!");
            } else System.out.println("Congrats! You've guessed the number in " + tries + " tries!");
        } while (guess != number);
    }
}