package classWork.lesson6;

import java.util.Scanner;

public class Task2sixth {
// 2. Создайте метод getReturnSum(int a, int b), который
//возвращает результат - сумма двух чисел, а печать в
//консоль производит вызывающий метод.

//    public static int getReturnSum(int a, int b) {
//        return a + b;
//    }
//
//    public static void main(String[] args) {

//        int result = getReturnSum(23, 5);
//

//        System.out.println("Returned Sum: " + result);

        ///////////////////////////////////////////////////////////////

    public static int getReturnSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();


        int result = getReturnSum(num1, num2);


        System.out.println("Returned Sum: " + result);
    }
}
