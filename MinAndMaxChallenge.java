import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        int min = 0, max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        boolean isInt = scanner.hasNextInt();
        if (isInt) {
            min = scanner.nextInt();
            max = min;
            while (true) {
                System.out.print("Enter number: ");
                isInt = scanner.hasNextInt();
                if (isInt) {
                    int currentNumber = scanner.nextInt();
                    if (currentNumber < min) {
                        min = currentNumber;
                    }
                    if (currentNumber > max) {
                        max = currentNumber;
                    }
                } else {
                    System.out.println("Max: " + max);
                    System.out.println("Min: " + min);
                    break;
                }
            }
        } else {
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
        }
        scanner.close();
    }
}
