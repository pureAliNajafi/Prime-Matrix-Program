
// import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
// import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void app() {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number :");
        int num = input.nextInt();
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
                if (i * i == num)
                    divisors.add(i);

            }
        }
        int len = divisors.size();

        System.out.println("please enter you're choice :");

        for (int i = 0; i < len / 2; i++) {
            int factor1 = divisors.get(i);
            int factor2 = divisors.get(len - i - 1);

            if (!MathHelper.checkSame(factor1, factor2))
                System.out.println(i + 1 + ") " + factor1 + "x" + factor2 + "  or  " + factor2 + "x" + factor1);
            else
                System.out.println(i + 1 + ") " + factor1 + "x" + factor2);

        }

        /* */int position = input.nextInt();
        if (position > len / 2 || position < 1) {
            System.out.println("invalid choice");
            input.close();
            return;
        }
        position = position - 1;
        int first = divisors.get(position);
        int second = divisors.get(divisors.size() - 1 - position);

        int which = 1;
        if (!MathHelper.checkSame(first, second)) {
            System.out.println("please enter you're choice :");
            System.out.println("1) " + first + "x" + second);
            System.out.println("2) " + second + "x" + first);
            which = input.nextInt();
        }

        switch (which) {
            case 1:
                PrimeMatrix.generatePrimeMatrix(first, second);
                break;
            case 2:
                PrimeMatrix.generatePrimeMatrix(second, first);
                break;
            default:
                System.out.println("Invalid choice");
        }

        input.close();
    }

    public static void main(String[] args) throws Exception {
        app();
    }
}