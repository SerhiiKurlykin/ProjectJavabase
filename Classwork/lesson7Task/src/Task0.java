public class Task0 {



    public static void findEvenOdd(int num) {
        if (num % 2 == 0) {  // Теперь проверяется остаток от деления
            System.out.println(num + " is even"); // Четное число
        } else {
            System.out.println(num + " is odd"); // Нечетное число
        }
    }

    public static void main(String[] args) {
        findEvenOdd(2);  // Четное число
        findEvenOdd(4);  // Четное число
        findEvenOdd(5);  // Нечетное число
    }
}