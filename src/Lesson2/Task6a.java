package Lesson2;

public class Task6a {
    //Створіть програму, яка виведе на консоль наступні малюнки. Використовуйте петлі, зірочки ("*") і пробіли (" ").
    //
    //    ********
    //    ********
    //    ********
    //    ********
    //    ********
    //    ********
    //    ********
    //    ********
    public static void main(String[] args) {
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
