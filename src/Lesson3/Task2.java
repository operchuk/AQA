package Lesson3;

public class Task2 {

// Інтернет створено за допомогою рядків HTML, таких як «<i>Hello</i>», який малює Hello курсивом.
// У цьому прикладі тег «i» створює <i> та </i>, які оточують слово «Hello».
// Маючи тег і рядок слова, створіть рядок HTML із тегами навколо слова, наприклад. "<i>Привіт</i>".
// Task: word = Welcome to Java World, tag=p

    public static void main(String[] args) {
        String tag1 = "<p>";
        String tag2 = "</p>";
        String string = "Welcome to Java World";
        String stringAll = String.join("", tag1, string, tag2);
        System.out.println(stringAll);
    }
}
