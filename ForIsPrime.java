public class ForIsPrime {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 44; i <= 67; i++) {
            if (count == 3) {
                break;
            }
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
