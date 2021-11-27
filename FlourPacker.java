public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigCountNeeded = goal / 5;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (bigCountNeeded == bigCount) {
            if ((bigCount * 5) == goal) {
                return true;
            } else if (goal - (bigCount * 5) <= smallCount) {
                return true;
            }
            return false;
        } else if (bigCountNeeded > bigCount) {
            if (goal - (bigCount * 5) <= smallCount) {
                return true;
            }
            return false;
        } else {
            if ((bigCountNeeded * 5) == goal) {
                return true;
            } else if (goal - (bigCountNeeded * 5) <= smallCount) {
                return true;
            }
            return false;
        }
    }
}
