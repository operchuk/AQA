package Lesson2;

public class Task5 {
    //Створіть програму, яка обчислює факторіал цілого значення n.
    public static void main(String[] args) {
        int n=10;
        int f = 1;
        for (int i = 1; i <=n; i ++){
            f = f*i;
        }
        System.out.println(n + "! = " + f);
    }
}
