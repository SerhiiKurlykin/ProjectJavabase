package classWork.lesson8;

public class Task1 {
//    Создайте переменные int a, b, c, d;
//2. Используя блок if (выражение) {}, составьте логические выражения
//    a. истина , если “а” меньше “b” И “b” равно “c”;
//    b. истина , если “а” больше “b” ИЛИ “c” равно “d”;
//    c. истина , если “а” НЕ равно “b”;


    public static void main(String[] args) {
        // 1. Создаем переменные
        int a = 5;
        int b = 10;
        int c = 10;
        int d = 15;

        // 2.a. Истина, если “a” меньше “b” И “b” равно “c”
        if (a < b && b == c) {
            System.out.println("a меньше b И b равно c");
        }

        // 2.b. Истина, если “a” больше “b” ИЛИ “c” равно “d”
        if (a > b || c == d) {
            System.out.println("a больше b ИЛИ c равно d");
        }

        // 2.c. Истина, если “a” НЕ равно “b”
        if (a != b) {
            System.out.println("a НЕ равно b");
        }
    }
}
