package Lesson2;

public class Task7 {
    //Створіть масив із 10 цілих чисел. Обчисліть і виведіть суму всіх його елементів, крім першого й останнього.
    public static void main(String[] args) {
        int sum= 0;
        int array[];
        array = new int[10];
        for (int i=0; i<array.length; i++) {
            array[i] =(int) (Math.random()*10);
            if(i != 0 && i !=array.length-1) {
                //System.out.println(array[i]);
                sum = sum+array[i];
            }
        }
        System.out.println(sum);
    }
}
