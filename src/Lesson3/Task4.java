package Lesson3;

public class Task4 {

// Дано рядок «ABCDEFGHIJK». Вам потрібно зробити цей рядок малими літерами та видалити всі голосні.

    public static void main(String[] args) {
        String string = "ABCDEFGHIJKI";
        String string1 = string.toLowerCase();
        String string2 = string1.replaceAll("[aeio]", "");
        System.out.println(string2);
    }
}
