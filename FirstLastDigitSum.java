public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        int remainder = 0;
        if (number < 0) {
            return -1;
        }
        sum += number % 10;
        if (number / 10 == 0) {
            remainder = number % 10;
        }
        number /= 10;
        while (number > 0) {
            remainder = number % 10;
            number /= 10;
        }
        sum += remainder;
        return sum;
    }
}
