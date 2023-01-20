import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    private final int[][] matrix;

    public Main(int size) {
        this.matrix = new int[size][size];
        System.out.println("---------------------------");
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                matrix[y][x] = Math.abs(ThreadLocalRandom.current().nextInt(250));
                System.out.printf("%d\t", matrix[y][x]);
            }
            System.out.print("\n");
        }
        System.out.println("---------------------------");

        for (int i = 0; i < size; i++) {
            new MatrixThread(i).start();
        }
    }

    public static void main(String[] args) {
        new Main(getNum(2, 10));
    }

    private static int getNum(int min, int max) {
        int num;
        do {
            try {
                num = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                num = min - 1;
            }
        } while (num < min || num > max);
        return num;
    }

    private class MatrixThread extends Thread {

        private final int index;

        private final int[] array;

        public MatrixThread(int index) {
            this.index = index;
            this.array = matrix[index];
        }

        @Override
        public void run() {
            int max = 0;
            for (int x : array) {
                if (x > max) {
                    max = x;
                }
            }
            System.out.printf("Nit %d je zavrsila s radom, najveći broj u retku je: %d\n", index, max);
        }

    }

}