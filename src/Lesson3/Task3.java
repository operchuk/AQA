package Lesson3;

public class Task3 {

// Дано два рядки. Перевірте, чи вони починаються на "The".
// Task: word1 = "End", word2 = "Finish";

    public static void main(String[] args) {
        String string1 = "The End";
        String string2 = "Finish";
        System.out.println(string1.startsWith("The"));
        System.out.println(string2.startsWith("The"));
    }
}
