public class SwitchChallenge {
    public static void main(String[] args) {
        char letter = 'F';

        switch (letter) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Found");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
