package classWork.lesson7Task;
// Напишите класс Converter для конвертации из градусов по Цельсию в
//Кельвины , Фаренгейты:
//У класса должны быть методы для конвертации.
//Реализуйте два метода в классе:
//runKelvinConverter(double baseValue)
//runFahrenheitConverter(double baseValue)

import java.util.Scanner;

public class Task2seven {
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
