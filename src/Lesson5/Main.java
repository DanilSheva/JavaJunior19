package Lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите сторону А:");
       int inputA= scaner.nextInt();

        System.out.println("Введите сторону В:");
        int inpultB= scaner.nextInt();

        int ploshad = inputA*inpultB;
        int perimetr = inputA + inpultB + inpultB+inputA;
        System.out.println("периметр прямоугольника:" + perimetr);
        System.out.println("площадь прямоугольника:" + ploshad);

    }
}
