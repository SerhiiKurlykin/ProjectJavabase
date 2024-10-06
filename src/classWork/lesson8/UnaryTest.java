package classWork.lesson8;

public class UnaryTest {
    public static void main(String[] args) {

        int number = 101;


        int postIncrement = number++;
        int postDecrement = number--;


        int preIncrement = ++number;
        int preDecrement = --number;


        System.out.println("Initial value of the variable:" +number);
        System.out.println("Value after post-increment: " + postIncrement);  // Значение до инкремента
        System.out.println("Value after post-decrement: " + postDecrement);  // Значение до декремента
        System.out.println("Value after pre-increment: " + preIncrement);    // Значение после инкремента
        System.out.println("Value after pre-decrement: " + preDecrement);    // Значение после декремента
        System.out.println("Initial value of the variable: " + number);
    }
}
