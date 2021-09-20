public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(1440L);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + minutes / 525600L + " y and " + (minutes % 525600L) / 1440 + " d");
        }
    }
}
