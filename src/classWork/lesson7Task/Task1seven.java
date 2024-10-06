package classWork.lesson7Task;// Напишите метод, который принимает на вход количество студентов и
//“рандомно” выбирает любого студента начиная со второго включительно.
//Например: в зуум сейчас присутствуют 10 участников. Первый участник - это
//преподаватель. Выбор должен быть сделан из 9 последующих, т.е. число
//выбирается из диапазона 2-10.

public class Task1seven {

    public static void setStudValue(int studentsValue) {
        int max = studentsValue;
        int min = 2;


        int randomStudNumber = (int)(min + Math.random() * (max - min + 1));


        System.out.println(randomStudNumber);
    }

    public static void main(String[] args) {

        setStudValue(10);
    }
}
