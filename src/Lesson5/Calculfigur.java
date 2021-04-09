package Lesson5;

import java.util.Scanner;

public class Calculfigur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фигуру");
        String figura = scanner.nextLine();

        System.out.println("Что посчитать?");
        String action = scanner.nextLine();

        if (figura.equalsIgnoreCase("круг")) {
            System.out.println("введите радиус");

            double radius = scanner.nextDouble();

            if (action.equalsIgnoreCase("периметр")) {
                System.out.println("периметр круга:" + (2 * Math.PI * radius));

            } else if (action.equalsIgnoreCase("площадь")) {
                System.out.println("площадь круга" + (Math.PI * (radius * radius)));

            } else {
                System.out.println("Это не действие");


            }
        } else if (figura.equalsIgnoreCase("квадрат")) {
            System.out.println("введите сторону квадрата ");
            double side = scanner.nextDouble();
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("площадь квадрата" + ((side * side)));

            } else {
                System.out.println("это не действие");
            }

        } else if (figura.equalsIgnoreCase("прямоугольник")) {
            System.out.println("введите длину прямоугольника ");
            double length = scanner.nextDouble();
            System.out.println("введите ширину прямоугольника");
            double width = scanner.nextDouble();
            if (action.equalsIgnoreCase("площадь")) {
                System.out.println("площадь прямоугольника" + ( (length * width)));


            } else {
                System.out.println("это не действие");
            }
        }else if (figura.equalsIgnoreCase("трапеция")){
            System.out.println("введите длину стороны А");
            double sideA = scanner.nextDouble();
            System.out.println("введите дину стороны Б");
            double sideB = scanner.nextDouble();
            System.out.println("Введите длину стороны Х");
            double sideH = scanner.nextDouble();
            System.out.println("введите сторону С");
             double sideS = scanner.nextDouble();
            if (action.equalsIgnoreCase("площадь ")){
                System.out.println("площадь трапеции"+((sideA+sideB*sideH+sideS)));
            }

        }
    }
}