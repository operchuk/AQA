package Lesson3;

public class Task8 {

// Номер цієї кредитної картки 1234 5678 9012 3456. У наступному вікні введіть номер картки **** **** **** 3456.

    public static void main(String[] args) {
        String string = "1234 5678 9012 3456";
        String a = string.substring(0, string.length()-4).replaceAll( "[1234567890]", "*");
        String b = string.substring(string.length()-4, string.length());
        System.out.println(a+b);
    }
}
