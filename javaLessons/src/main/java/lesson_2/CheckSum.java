package lesson_2;

public class CheckSum {
    public static void main(String[] args) {
        sumCheck(3, 5);
    }

    public static boolean sumCheck(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
}
