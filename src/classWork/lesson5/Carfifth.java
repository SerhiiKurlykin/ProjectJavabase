package classWork.lesson5;

public class Carfifth {
    private String name;
    private int year;
    //    default constructor
    public Carfifth() {}

    public Carfifth(String name) {
        this.name = name;
    }

    public Carfifth(int year) {
        this.year = year;
    }

    public Carfifth(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", year: " + this.year;




    }
}