public class OperatorChallenge {
    public static void main(String[] args) {
        double var1 = 20.00;
        double var2 = 80.00;
        double result = 100 * (var1 + var2);
        double remainder = result % 40;
        boolean isRemainder = remainder == 0 ? true : false;
        System.out.println(isRemainder);
        if (!isRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
