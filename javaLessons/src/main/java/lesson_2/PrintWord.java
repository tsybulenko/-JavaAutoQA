package lesson_2;

public class PrintWord {
    public static void main(String[] args) {
                printString( "word", 5);
    }
        public static void printString(String a, int b) {
            /* for(int c = 0; c < b; c++) */
            while(b>0) {
            System.out.println(a);
            b--;
        }

    }
}
