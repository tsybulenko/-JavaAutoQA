package lesson_2;



public class InvertAr {
    public static void main(String[] args) {
        invertArr();
    }

    public static void invertArr() {
        int[] arr = {1, 0, 1, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            //System.out.println(arr[i]);
        }
    }
}