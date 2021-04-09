package lesson4;

public class Main3 {
    public static void main(String[] args) {
        int[] mass = new int[15];

//        mass[0] = 5;
//        mass[1] = 10;
//        mass[2] = 15;
//        mass[3] = 20;
//
//        mass[14] = 75;
        int value = 5;
        for (int i = 0; i < 15; i++) {
            mass[i] = value;
            value = value + 5;

        }
    }
}
