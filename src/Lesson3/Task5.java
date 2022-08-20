package Lesson3;

public class Task5 {

// Дано 2 прямі a і b. Створіть рядок c у формі короткий+довгий+короткий, з коротшим рядком зовні та довшим усередині.

    public static void main(String[] args) {
        String a = "hop";
        String b = "hello";
        if (a.length() < b.length()){
            System.out.println(String.join("", a, b, a));
        }
            else System.out.println(String.join("", b, a, b));
    }
}
