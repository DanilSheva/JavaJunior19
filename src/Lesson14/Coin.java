package Lesson14;

public class Coin {
    private double diameter;
    private  int year;
    private int nominal;

    public Coin(double diameter, int year, int nominal) {
        this.diameter = diameter;
        this.year = year;
        this.nominal = nominal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coin)) return false;

        Coin coin = (Coin) o;

        if (Double.compare(coin.getDiameter(), getDiameter()) != 0) return false;
        if (getYear() != coin.getYear()) return false;
        return getNominal() == coin.getNominal();
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getDiameter());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + getYear();
        result = 31 * result + getNominal();
        return result;
    }

    public Coin (){

    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "diameter=" + diameter +
                ", year=" + year +
                ", nominal=" + nominal +
                '}';
    }
}
