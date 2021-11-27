import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int sum = 0;

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                sum += scanner.nextInt();
                i++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum of the 10 numbers you entered: " + sum);
        scanner.close();
    }
}
