package lesson_2;

public class CheckPosOrNeg2 {
    public static void main(String[] args) {
        returnPosOrNeg(-2);
    }

    public static boolean returnPosOrNeg(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }
}
