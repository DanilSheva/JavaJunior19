package HomeWorkOOP;

public class Shapes {
    private int A = 13;
    private int B = 13;
    private int C = 13;


    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public int getC() {
        return C;
    }

    public void setC(int c) {
        C = c;
    }

    public void setB(int b) {
        B = b;
    }

    public void setA(int a) {
        A = a;
    }

    public void Shapes() {
        if (A == B && B == C) {
            System.out.println("треугольник");

        } else
            System.out.println("Разносторонний треугольник");


    }


}









