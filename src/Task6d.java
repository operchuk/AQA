public class Task6d {
    //Створіть програму, яка виведе на консоль наступні малюнки. Використовуйте петлі, зірочки ("*") і пробіли (" ").
    //
    //*
    //**
    //***
    //****
    //*****
    //******
    //*******
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
