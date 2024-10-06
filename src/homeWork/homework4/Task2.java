package homeWork.homework4;

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        // 1. Генерация случайного числа секунд от 0 до 28800 (8 часов)
        Random random = new Random();
        int n = random.nextInt(28801); // Генерирует число от 0 до 28800

        // 2. Вывод количества секунд
        System.out.println("Осталось секунд: " + n);

        // 3. Переводим секунды в часы
        int hoursLeft = n / 3600; // 3600 секунд в одном часе

        // 4. Вывод понятной информации в зависимости от количества полных часов
        if (hoursLeft > 1) {
            System.out.println("Осталось " + hoursLeft + " часов.");
        } else if (hoursLeft == 1) {
            System.out.println("Остался 1 час.");
        } else {
            System.out.println("Осталось менее часа.");
        }
    }
}
