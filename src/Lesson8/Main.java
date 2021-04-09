package Lesson8;

public class Main {
    public static void main(String[] args) {

        Dog dog1  = new Dog();
        Dog dog2  = new Dog();

        dog1.setName("Тузик");
        dog2.setName("Барбос");

        dog1.setAge(12 );
        dog2.setAge(5);

        dog1.setPoroda("Бигль");
        dog2.setPoroda("Пудиль");

        dog2.printAbout();
        dog1.printAbout();


    }
}
