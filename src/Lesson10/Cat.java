package Lesson10;

public class Cat extends Animal {

    @Override
    public void voice() {
        System.out.println("мяу мяу");
    }

    @Override
    public String toString() {
        return "Кот: " + this.getAge() + " года ";

    }
}