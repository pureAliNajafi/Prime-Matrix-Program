import java.util.Locale;

public class PrimeMatrix {
    public static void generatePrimeMatrix(int row, int col) {
        Locale.setDefault(Locale.US);

        int num = 1;
        System.out.printf("Here are the prime numbers from 1 to %d in a %dx%d mtrix:\n", row * col, row, col);
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                // System.out.print(((i - 1) * col) + j);
                // System.out.print(num);
                if (MathHelper.checkPrime(num)) {
                    System.out.print(" \033[33m★\033[0m "); // yellow star
                } else {
                    System.out.print(" ★ ");
                }
                num++;
            }
            System.out.println();
        }

    }
}
