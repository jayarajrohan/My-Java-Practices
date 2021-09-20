public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        getDurationString(7663);
        getDurationString(127, 43);
    }

    public static void getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid value");
        } else {
            System.out.println((minutes / 60) + "h " + (minutes % 60) + "m " + seconds + "s");
        }
    }

    public static void getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value");
        } else {
            getDurationString(seconds / 60, seconds % 60);
        }
    }

}