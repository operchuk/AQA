public class Task8 {
    //Виведіть усі числа від 1 до 100, які діляться на 3 або на 5, але не діляться на 2.
    public static void main(String[] args) {
        for ( int i=1; i<=100; i++ ) {
            if(( i % 3 == 0 || i % 5 ==0) && i % 2 !=0){
                System.out.println(i);
            }
        }
    }
}
