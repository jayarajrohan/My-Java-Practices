public class ForSumThreeAndFiveChallenge {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (count == 5) {
                break;
            } else if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println(i + " can be divided by 3 and 5");
            }
        }
        System.out.println("Total: " + sum);
    }
}
