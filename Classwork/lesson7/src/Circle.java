import java.util.Scanner;

public class Circle {
    public static double Ference(double radius) {
        return 2 * 3.14 * radius;
    }


    public static double Square(double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Radius: ");
        double radius = sc.nextDouble();
        double circumference = Ference(radius);
        double area = Square(radius);


        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + circumference);
        System.out.println("Square: " + area);
    }
}
