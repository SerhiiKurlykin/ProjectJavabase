
// Напишите программу на Java для того, чтобы поменять местами значения,
//хранящиеся в двух переменных с помощью третьей переменной:
//На вход: а = 2; b = 5;
//На выход: a = 5; b = 2;
//Используйте переменную temp;


import java.util.Scanner;

public class Task3 {
//    public static void change(){
//        int a;
//        int b;
//        int temp;
//        System.out.println("Enter value a and b");
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//        b = sc.nextInt();
//        System.out.println("Before change " + a + b);
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println("After change " + a + b);
//    }
//
//    public static void main(String[] args) {
//       change();
//    }


    public static void secondchange(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a: " );
        int a = sc.nextInt();
        System.out.println("Enter value b: " );
        int b = sc.nextInt();
        System.out.println("Before change: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After change: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        secondchange();
    }

}
