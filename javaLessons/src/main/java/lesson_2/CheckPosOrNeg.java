package lesson_2;

public class CheckPosOrNeg {
    public static void main(String[] args) {
            printPosOrNeg(-2);
        }

        public static void printPosOrNeg(int a) {
            if (a >= 0) {
                System.out.println("Положительное");
            } else {
                System.out.println("Отрицательное");
            }
        }
    }
