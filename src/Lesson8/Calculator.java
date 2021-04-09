package Lesson8;

public class Calculator {
    public static Fraction sum(Fraction drob1, Fraction drob2) {
        int commonZnamenatel = drob1.getZnamenatel() * drob2.getZnamenatel();
        int commonChislitel = drob1.getChislitel() * drob2.getZnamenatel() + drob2.getChislitel() * drob1.getZnamenatel();

        Fraction result = new Fraction(commonChislitel, commonZnamenatel);
        return result;





    }
    public static Fraction difference(Fraction drob1, Fraction drob2){
        int commonZnamenatel = drob1.getZnamenatel() * drob2.getZnamenatel();
        int commonChislitel = drob1.getChislitel() * drob2.getZnamenatel() - drob2.getChislitel() * drob1.getZnamenatel();
        Fraction result = new Fraction(commonChislitel,commonZnamenatel);
        return result;
    }



}






