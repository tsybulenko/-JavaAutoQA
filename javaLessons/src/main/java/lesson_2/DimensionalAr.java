package lesson_2;

public class DimensionalAr {
    public static void main(String[] args){
        createDimArr();
    }
    public static void createDimArr() {
        int[][] square = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || i + j == 4) {
                    square[i][j] = 1;
                }
                System.out.print(square[i][j]);
            }
            System.out.println();
        }
    }
    }
