import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
//        Random rand = new Random();
//        int randNum1 = rand.nextInt(); // number from -2**31 to 2**31 - 1 (int size)
//        int randNum2 = rand.nextInt(10); // from 0 to bound - 1 (10 - 1 = 9)
//        int randNum3 = rand.nextInt(10, 100); // from origin(10) to bound - 1 (100 - 1 = 99)

//        System.out.println("randNum1 = " + randNum1);
//        System.out.println("randNum2 = " + randNum2);
//        System.out.println("randNum3 = " + randNum3);


        //double doubleNum1 = rand.nextDouble();
        //    double doubleNum2 = rand.nextDouble(10);
        //    double doubleNum3 = rand.nextDouble(10, 50);
        //    System.out.println("doubleNum1 = " + doubleNum1); // from 0 to 1
        //    System.out.println("doubleNum2 = " + doubleNum2); // from 0 to 10 - 1
        //    System.out.println("doubleNum3 = " + doubleNum3); // from 10 to 50 - 1
        //}

// call method random() from Math class
double num = Math.random(); // double from 0 to 1
        System.out.println("num = " + num);

//////////////////////////////////////////////////////////////////////////////////////////
        //        Math.random()*(max-min+1)+min
//        int minVal = 10;
//        int maxVal = 50;
//        int randValue = (int)(Math.random() * (maxVal - minVal) + minVal);
//        System.out.println("randValue = " + randValue);

///////////////////////////////////////////////////////////////////////////////////////////
        //        Math.random()*(max-min+1)+min
//        Math.random() => from 0 to 1
//        max-min+1 => 50 - 10 + 1 = 41
//        Math.random()*(max-min+1) => from 0 to 41 - 1 = 40 double
//        Math.random()*(max-min+1)+min => from 10 to 51(51 - 1 = 50)
//        int minVal = 10;
//        int maxVal = 50;
      //  int randValue = (int)(Math.random() * (maxVal - minVal + 1) + minVal);
//        System.out.println("randValue = " + randValue);

//////////////////////////////////////////////////////////////////////////////////////////////////////

       //Использование Random класса:
        //Импортировать класс java.util.Random
        //Создать экземпляр класса Random (Random rand = new Random())
        //Вызовите один из следующих методов объекта rand:
        //nextInt(upperbound) генерирует случайные числа в диапазоне от 0 до upper bound -1.
        //nextFloat() генерирует число с плавающей запятой от 0,0 до 1,0.
        //nextDouble() генерирует двойное число между 0.0 и 1.0.

       // Random rand = new Random();

        // Генерируем случайное целое число в диапазоне от 0 до upperbound - 1 (например, upperbound = 10)
//        int upperbound = 10;
//        int randomInt = rand.nextInt(upperbound);
//        System.out.println("Random integer between 0 and " + (upperbound - 1) + ": " + randomInt);
//
//        // Генерируем случайное число с плавающей запятой (float) от 0.0 до 1.0
//        float randomFloat = rand.nextFloat();
//        System.out.println("Random float between 0.0 and 1.0: " + randomFloat);
//
//        // Генерируем случайное число с двойной точностью (double) от 0.0 до 1.0
//        double randomDouble = rand.nextDouble();
//        System.out.println("Random double between 0.0 and 1.0: " + randomDouble);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Использование Math.random 
        //
        //Объявить минимальное значение диапазона
        //Объявить максимальное значение диапазона
        //Используйте формулу Math.random()*(max-min+1)+min для создания значений, включающих значение min и max

        int min = 5;
        int max = 15;


        int randomInt = (int)(Math.random() * (max - min + 1) + min);


        System.out.println(randomInt);

    }



}
