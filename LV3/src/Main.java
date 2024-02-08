import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintOdd PO = new PrintOdd();
        SumEven SE = new SumEven();
        ArithmMiddle AM = new ArithmMiddle();
        boolean bool;
        System.out.println("*****************");
        System.out.println("1.) Arithmetic middle of entered numbers.");
        System.out.println("2.) Sum of entered even numbers.");
        System.out.println("3.) Print all entered odd numbers.");
        System.out.println("Any other) Exit.");
        System.out.println("*****************\n");
        int choice = 0, n = 10;
        do {
            System.out.print("Your choice: ");
            Scanner input = new Scanner(System.in);
            bool = false;
            try {
                choice = input.nextInt();
            } catch (InputMismatchException greska) {
                bool = true;
                System.out.println("NIJE BROJ!\n");
            } finally {
                input.close();
            }
        } while (bool);
        switch (choice) {
            case 1:
                AM.arithmMiddle(n);
                break;
            case 2:
                SE.sumEven(n);
                break;
            case 3:
                PO.printOdd(n);
            default:
                break;
        }
    }
}