package lesson_2;

public class CheckSum {
    public static void main(String[] args) {
        sumCheck(3, 5);
    }

    public static boolean sumCheck(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
