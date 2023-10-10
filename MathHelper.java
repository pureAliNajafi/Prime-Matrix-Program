public class MathHelper {
    public static boolean checkSame(int n1, int n2) {
        return n1 == n2;
    }

    public static boolean checkPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
