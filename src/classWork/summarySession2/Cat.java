package classWork.summarySession2;

public class Cat {
    public String name;
    public Integer age;

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void run(){
        System.out.println("Кот по имени: "+name+ " Начал бежать!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nameCat='" + name + '\'' +
                ", ageCat=" + age +
                '}';
    }
}