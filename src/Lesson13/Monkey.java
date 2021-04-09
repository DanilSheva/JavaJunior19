package Lesson13;

public class Monkey implements ZooAnimal{
    @Override
    public void voice() {
        System.out.println("уауууаа");
    }

    @Override
    public void jump() {
        System.out.println("Обезьяна прыгает");

    }

    @Override
    public void run() {
        System.out.println("Обезьяна бегает");

    }
}
