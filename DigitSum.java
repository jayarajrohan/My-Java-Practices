public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(11));
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(87));
        System.out.println(sumDigits(1258));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        int remainder;
        if (number < 10) {
            return -1;
        }
        do {
            remainder = number % 10;
            number = number / 10;
            sum += remainder;
        } while (number != 0);
        return sum;
    }
}
