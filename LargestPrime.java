public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        boolean isPrime = true;
        int max = 0;

        if (number <= 1) {
            return -1;
        }

        for (int i = 2; i <= number; i++) {
            if ((number % i) == 0) {
                isPrime = false;
                boolean isIPrime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if ((i % j) == 0) {
                        isIPrime = false;
                    }
                }
                if (isIPrime && i > max) {
                    max = i;
                }
            }
        }
        if (!isPrime) {
            return max;
        }

        return -1;
    }
}
