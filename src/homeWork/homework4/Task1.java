package homeWork.homework4;

import java.util.Scanner;

public class Task1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ввод значений переменных m и n
            System.out.println("Введите число m: ");
            double m = scanner.nextDouble();

            System.out.println("Введите число n: ");
            double n = scanner.nextDouble();

            // Расчет абсолютного расстояния от 10
            double distanceM = Math.abs(m - 10);
            double distanceN = Math.abs(n - 10);

            // Сравнение расстояний и вывод ближайшего числа
            if (distanceM < distanceN) {
                System.out.println("Число " + m + " ближе к 10.");
            } else if (distanceN < distanceM) {
                System.out.println("Число " + n + " ближе к 10.");
            } else {
                System.out.println("Оба числа равноудалены от 10.");
            }

            scanner.close();
        }
    }

