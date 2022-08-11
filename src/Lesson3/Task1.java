package Lesson3;

public class Task1 {

// Дано рядок. Напишіть код, який створить новий рядок із перших двох символів початкового рядка.
// Якщо рядок коротший за довжину 2, поверніть усе, що є, тому "X" дає "X", а порожній рядок "" дає порожній рядок "".

    public static void main(String[] args) {
        String a = "Operchuk Volodymyr";
             if (a.length() > 2)
            System.out.println(a.substring(0, 2));
        else System.out.println(a);
    }
}
