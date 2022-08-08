public class Task4 {
    //Створіть два масиви з 10 цілих чисел. Знайдіть квадратний корінь з кожного елемента в першому масиві та помістіть його результат у другий масив. Вивести другий масив на консоль.
    public static void main(String[] args) {
        int array1[];
        array1 = new int[10];
        float array2[];
        array2 = new float[array1.length];

        for (int i=0; i < array1.length; i++) {

            array1[i] =(int) (Math.random()*100);
            System.out.print(i + " ел. масив 1" + " = " +  array1[i]);
            array2[i] =(float) Math.sqrt(array1[i]);
            System.out.println("     масив 2 (sqrt)" + " = " +  array2[i]);
        }
    }
}
