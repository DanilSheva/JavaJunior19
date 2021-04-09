package lesson2;

public class main2 {
    public static void main(String[] args) {
        int tour = 40000;
        int salary = 60000;
        int dayTrips = 8;
        if (dayTrips > 7 || tour < salary) {
            System.out.println("поедем");
        } else {
            System.out.println("не поедем");
        }
    }
}
