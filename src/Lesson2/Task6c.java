package Lesson2;

public class Task6c {
    //Створіть програму, яка виведе на консоль наступні малюнки. Використовуйте петлі, зірочки ("*") і пробіли (" ").
    //
    //     *
    //    ***
    //   *****
    //  *******
    // *********
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++)
            if (i%2 ==0)
            {
                for (int j = 0; j < 9 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
}
