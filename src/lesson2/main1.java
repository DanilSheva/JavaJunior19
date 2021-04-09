package lesson2;

public class main1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 4;

        if (a == b && b == c && c == a) {
            System.out.println(" это равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println(" это разносторонний треугольник ");
        } else {
            System.out.println("это равнобедренный треугольник");
        }

    }
}
