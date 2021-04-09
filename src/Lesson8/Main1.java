package Lesson8;

public class Main1 {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(12,3,7);
        Triangle triangle2 = new Triangle(3,8,1);
        Triangle triangle3 = new Triangle(5,5,5);

        triangle3.setSideC(4);// перезаписал число




//        triangle1.setSideA(5);
//        triangle1.setSideB(3);
//        triangle1.setSideC(7);
//
//        triangle2.setSideA(8);
//        triangle2.setSideB(1);
//        triangle2.setSideC(9);
//
//        triangle3.setSideA(2);
//        triangle3.setSideB(3);
//        triangle3.setSideC(7);

        triangle1.printTypeTriangle();
        triangle2.printTypeTriangle();
        triangle3.printTypeTriangle();

        System.out.println(triangle1.getSideA());
    }

}
