public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        int count = 0, digitCount;
        String word;
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            digitCount = getDigitCount(number);
            number = reverse(number);
            while (number > 0) {
                switch (number % 10) {
                    case 0:
                        word = "Zero ";
                        break;
                    case 1:
                        word = "One ";
                        break;
                    case 2:
                        word = "Two ";
                        break;
                    case 3:
                        word = "Three ";
                        break;
                    case 4:
                        word = "Four ";
                        break;
                    case 5:
                        word = "Five ";
                        break;
                    case 6:
                        word = "Six ";
                        break;
                    case 7:
                        word = "Seven ";
                        break;
                    case 8:
                        word = "Eight ";
                        break;
                    case 9:
                        word = "Nine ";
                        break;
                    default:
                        word = "Invalid Input";
                        break;
                }
                System.out.print(word);
                count++;
                number /= 10;
            }
            if (count != digitCount) {
                for (int i = count; i < digitCount; i++) {
                    System.out.print("Zero ");
                }
                System.out.println("");
            } else {
                System.out.println("");
            }
        }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        if (number < 0) {
            while (number < 0) {
                reverseNumber *= 10;
                reverseNumber += number % 10;
                number /= 10;
            }
            return reverseNumber;
        }
        while (number > 0) {
            reverseNumber *= 10;
            reverseNumber += number % 10;
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
