package Lesson2;

public class Task3 {
 //Створити масив з 10 елементів, заповнити випадковими цілими числами, вивести на екран, кожний елемент з нового рядка
    public static void main(String[] args) {
        int array [];
        array = new int[10];
        for (int i=0; i < array.length; i++) {
            array[i] =(int) (Math.random()*10);
            System.out.println("Елемент масиву №" + i + "= " + array[i]);
        }
    }
}
