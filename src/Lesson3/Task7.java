package Lesson3;

public class Task7 {

// Дано рядок «Dan, John, Will, Kate, Adam, Robin». Вивести всі імена з наступного рядка з нового рядка.

    public static void main(String[] args) {
        String a = "Den, John, Will, Kate, Adam, Robin";
        String[] b = a.split(", ");
        for(String i: b){
            System.out.println(i);
        }
    }
}
