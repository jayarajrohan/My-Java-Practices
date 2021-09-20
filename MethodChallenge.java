public class MethodChallenge {
    public static void main(String[] args) {
        int position;

        position = calculateHighScorePosition(1500);
        displayHighScorePosition("Rohan", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Sarmi", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Renota", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Bujji", position);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
