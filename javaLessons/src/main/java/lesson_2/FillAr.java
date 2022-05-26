package lesson_2;

public class FillAr {
    public static void main(String[] args) {
        fillArr();
    }

    public static void fillArr() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i]);
        }
    }
}
