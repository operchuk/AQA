package Lesson2;

public class Task9 {
    //Створіть масив довільної довжини та заповніть його випадковими цілими числами. Використовуючи цикли та умови, відсортуйте цей масив і виведіть його на консоль. Ви можете використовувати будь-який алгоритм сортування. Не використовуйте вбудовані методи для сортування масиву.
    public static void main(String[] args) {
                int [] numbers = {69, 56, 23, 5, 39};
                printArray(numbers);
                SelectionSort(numbers);
        printArray(numbers);
    }
    public static void printArray(int [] array){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+ ", ");
        }
        System.out.println("");
    }
    public static void SelectionSort(int [] array){
        for (int i=0; i<array.length; i++){
            int min = array[i];
            int min_i = i;
            for (int j=i+1; j<array.length; j++){
                if (array[j]<min){
                    min = array[j];
                    min_i = j;
                }
            }
            if (i!=min_i){
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
    }
}