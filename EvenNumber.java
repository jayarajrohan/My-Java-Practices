public class EvenNumber {
    public static void main(String[] args) {
        int start = 4, end = 20, sum = 0, count = 0;

        while (start <= end) {
            start++;
            if (count == 5) {
                break;
            } else if (!(isEvenNumber(start))) {
                continue;
            }
            sum += start;
            count++;
        }
        System.out.println("Total: " + sum);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2 == 1) || number <= 0) {
            return false;
        }
        return true;
    }
}
