import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0, count = 0;
        long average = 0L;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                sum += scanner.nextInt();
                count++;
            } else {
                average = Math.round(((double) sum) / ((double) count));
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
        scanner.close();
    }
}
