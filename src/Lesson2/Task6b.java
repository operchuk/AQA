package Lesson2;

public class Task6b {
    //Створіть програму, яка виведе на консоль наступні малюнки. Використовуйте петлі, зірочки ("*") і пробіли (" ").
    //
    //********
    //*      *
    //*      *
    //*      *
    //********
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == a - 1) {
                    System.out.print('*');
                } else {
                    if (j == 0 || j == b - 1) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.print("\n\r");
        }

    }
}
