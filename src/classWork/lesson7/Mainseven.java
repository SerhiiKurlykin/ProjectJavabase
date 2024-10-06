package classWork.lesson7;

import java.util.Scanner;

public class Mainseven {

//    public static void main (String[] args)  {
//        findEvenOdd(2);
//        findEvenOdd(4);
//        findEvenOdd(5);
//    }
//
//    public static void findEvenOdd(int num)  {
//        if (num % 2 == 0) {
//            System.out.println(num+" is even"); }
//        else  {
//            System.out.println(num+" is odd");  }
//
//    }


//    public static int RandomNumber() {
//        Random random = new Random();
//
//        return 2 + random.nextInt(9);
//    }
//
//    public static boolean Even(int number) {
//        return number % 2 == 0;
//    }
//
//    public static void main(String[] args) {
//
//        int randomNumber = RandomNumber();
//
//
//        if (Even(randomNumber)) {
//            System.out.println(randomNumber + " является четным.");
//        } else {
//            System.out.println(randomNumber + " является нечетным.");
//        }
//    }

    public static double KelvinConverter(double baseValue){
        return baseValue + 273.15;
    }
    public static double FahrenheitConverter(double baseValue){
        return 1.8 * baseValue + 32;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");
        double baseValue = sc.nextDouble();
        double kelvinValue = KelvinConverter(baseValue);
        double fahrenheitValue = FahrenheitConverter(baseValue);
        System.out.println(baseValue + " градусов Цельсия = " + kelvinValue + " Кельвинов");
        System.out.println(baseValue + " градусов Цельсия = " + fahrenheitValue + " Фаренгейтов");
    }


}

