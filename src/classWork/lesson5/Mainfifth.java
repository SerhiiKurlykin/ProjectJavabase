package classWork.lesson5;

import java.util.Scanner;

public class Mainfifth {
    public static void main(String[] args) {
//        System.out.println("Hello Java!!!");
//        Car car = new Car();
////      before initialization
//        System.out.println(car.year);
//        System.out.println(car.name);
////      after init
////        car.name = "Audi";
////        car.year = 2002;
//
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a name");
//        car.name = sc.nextLine();
//        System.out.println("Enter a year");
//        car.year = sc.nextInt();
//        System.out.println(car.year);
//        System.out.println(car.name);

////////////////////////////////////////////////////////////////////////////////
        Carfifth toyota = new Carfifth("Toyota"); /// создаем объект
        System.out.println(toyota);
/////////////////////////////////////////////////////////////////////////////////
        Carfifth toyota1991 = new Carfifth(1991);
        System.out.println(toyota1991);
////////////////////////////////////////////////////////////////////////////////////
        Carfifth tesla2020 = new Carfifth("Tesla", 2020);
        System.out.println(tesla2020);
 ///////////////////////////////////////////////////////////////////////////////////




    }}