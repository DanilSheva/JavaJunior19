package Lesson11;

public class Rectangle {
    private ForSidesFigur forSidesFigur = new ForSidesFigur();

    public Rectangle() {

    }
     public Rectangle (int a , int b){
    // forSidesFigur.setA(a);
    //  forSidesFigur.setB(b);
    // forSidesFigur.setC(a);
    // forSidesFigur.setD(b);


}

    public int perimeter() {
        return forSidesFigur.perimeter();
    }

    public double area() {
        return forSidesFigur.area();
    }


}
