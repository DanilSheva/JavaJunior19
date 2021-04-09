package lesson2;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        int number = 17;
        int ostatocOtDelenia = number % 2;

        if (ostatocOtDelenia == 0) {
            System.out.println("  это четное число ");

        } else {
            System.out.println("это не четное число ");
        }
    }
}
