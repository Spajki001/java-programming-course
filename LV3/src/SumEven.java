import java.util.Scanner;

public class SumEven {
    public void sumEven(int n) {
        System.out.println("\nYour input: ");
        int[] polje = new int[n];
        int brojevi, suma = 0;
        Scanner ulaz = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            brojevi = ulaz.nextInt();
            polje[i] = brojevi;
        }
        ulaz.close(); // Close the Scanner
        for (int i = 0; i < n; i++) {
            if (polje[i] % 2 == 0) {
                suma += polje[i];
            }
        }
        System.out.println("Sum of even numbers is: " + suma);
    }
}
