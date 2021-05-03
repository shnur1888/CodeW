import static java.lang.Math.sqrt;

public class Prime {
    public static boolean isPrime(int ANum) {
        if (ANum < 2)
            return false;
        double s = sqrt(ANum);
        for (int i = 2; i <= s; i++) {
            if (ANum % i == 0)
                return false;
        }
        return true;
    }


    public static boolean isPrime2(int num) {
        return num > 1 && java.math.BigInteger.valueOf(num).isProbablePrime(20);
    }
}
