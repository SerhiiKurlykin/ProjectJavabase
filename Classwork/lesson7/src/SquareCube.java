import java.util.Random;

public class SquareCube {
    public static int square(int num) {
        return num * num;
    }

    public static int cube(int num) {
        return num * num * num;
    }

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt();

        System.out.println(randomNumber);

        int squareResult = square(randomNumber);
        int cubeResult = cube(randomNumber);

        System.out.println("Square" + randomNumber + " = " + squareResult);
        System.out.println("Cube " + randomNumber + " = " + cubeResult);
    }
}
