package Lesson10;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setAge(2);
        dog1.voice();

        Dog dog2 = new Dog();
        dog2.setAge(2);
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.toString());





    }
}
