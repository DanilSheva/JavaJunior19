package Lesson8;

public class Main2 {
    public static void main(String[] args) {
        Fraction number1 = new Fraction(1,2);
        Fraction number2 = new Fraction(2,5);

        number1.printInfo();
        number2.printInfo();

        Fraction resultAdd = Calculator.sum(number1, number2);
        resultAdd.printInfo();

    }
    public static void  main1 (String[] args){
        Fraction number1 = new Fraction(1,2);
        Fraction number2 = new Fraction(2,5);
        number1.printInfo();
        number2.printInfo();
        Fraction resultAdd = Calculator.difference(number1,number2);
        resultAdd.printInfo();

    }

}