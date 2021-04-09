package Lesson11;

public class ForSidesFigur {
    private int a;
    private int b;
    private int c;
    private int d;

    public ForSidesFigur (){

    }

    public ForSidesFigur(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForSidesFigur)) return false;

        ForSidesFigur that = (ForSidesFigur) o;

        if (a != that.a) return false;
        if (b != that.b) return false;
        if (c != that.c) return false;
        return d == that.d;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        result = 31 * result + c;
        result = 31 * result + d;
        return result;
    }

    @Override
    public String toString() {
        return "ForSidesFigur{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    public int perimeter (){
        return a+c+b+d;
    }
    public double area(){
        double p = this.perimeter()/2;
        double area = Math.sqrt((p-a)*(p-b)*(p-c)*(p-d));
        return area;
    }
}
