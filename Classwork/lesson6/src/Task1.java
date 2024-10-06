import java.util.Scanner;

public class Task1 {
//1. Создайте метод getSum(int a, int b), который ничего не
//возвращает, и печатает результат суммы двух полученных
//чисел в консоль.
//
//    public static void getSum(int a, int b) {
//        int sum = a + b;
//        System.out.println("Sum: " + sum);
//    }
//
//    public static void main(String[] args) {
//
//        getSum(3, 5);
//////////////////////////////////////////////////////////////////////////////////////////

        public static void getSum(int a, int b) {
            int sum = a + b;
            System.out.println("Sum: " + sum);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();


            getSum(num1, num2);
    }
}
////////////////////////////////////////////////////

///*Создайте метод getSum(int a, int b), который ничего не возвращает,
//и печатает результат суммы двух полученных чисел в консоль.*/
//public static void getSum(int a, int b) {
//    System.out.println(a + b);
//}
///*Создайте метод getReturnSum(int a, int b),
//который возвращает результат - сумма двух чисел, а печать в консоль производит вызывающий метод */
//public static int getReturnSum(int a, int b) {
//    return a + b;
//}


