import java.util.Scanner;

public class ArithmMiddle {
    public void arithmMiddle(int n) {
        System.out.println("\nYour input: ");
        int[] polje = new int[n];
        int brojevi;
        float suma = 0;
        float arithm;
        Scanner ulaz = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            brojevi = ulaz.nextInt();
            polje[i] = brojevi;
        }
        for (int i = 0; i < n; i++) {
            suma += polje[i];
        }
        arithm = suma / n;
        System.out.println("Arithmetic middle of entered numbers is: " + arithm);
    }
}
