package Lesson10;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("гав гав");
    }

    @Override
    public String toString() {
        return "Собака: " + this.getAge() + " года ";
    }
}
