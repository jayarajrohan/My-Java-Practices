public class ForChallenge {
    public static void main(String[] args) {
        for (double i = 2.0; i < 9.0; i++) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return ((interestRate / 100) * amount);
    }
}