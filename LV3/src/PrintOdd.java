import java.util.Scanner;

public class PrintOdd {
    public void printOdd(int n) {
        System.out.println("\nYour input: ");
        int[] polje = new int[n];
        int brojevi;
        Scanner ulaz = new Scanner(System.in);
        for(int i = 0; i < n;i++) {
            brojevi = ulaz.nextInt();
            polje[i] = brojevi;
        }
        System.out.print("Odd numbers are: ");
        for(int i = 0; i < n;i++) {
            if (polje[i] % 2 != 0) {
                System.out.print(polje[i]);
            }
        }
    }
}
