public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        int remainder1, remainder2;
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }
        remainder1 = number1 % 10;
        number1 /= 10;
        remainder2 = number2 % 10;
        number2 /= 10;
        if ((remainder1 == remainder2) || (remainder1 == number2) || (number1 == number2)) {
            return true;
        }
        return false;
    }
}
