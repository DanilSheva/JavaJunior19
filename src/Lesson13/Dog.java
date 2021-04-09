package Lesson13;

public class Dog implements ZooAnimal{
    @Override
    public void voice() {
        System.out.println("Гав Гав");
    }

    @Override
    public void jump() {
        System.out.println("Собака прыгает ");

    }

    @Override
    public void run() {
        System.out.println("Собака бегает");

    }
}
