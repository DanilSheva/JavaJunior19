package HomeWork;

public class lesson1 {


    public static void main(String[] args) {
        int OurMoney = 1000;
        int Pizza = 230;
        int ChewingGum = 26;
        double Candies = 2.5;
        int QuantityPizza = OurMoney / Pizza;
        System.out.println(OurMoney / Pizza);
        int Spent = 920;


        int TheRestOfTheMoney = 80;
        int NumberOfChewingGum = TheRestOfTheMoney / ChewingGum;
        System.out.println(TheRestOfTheMoney / ChewingGum);
        int Spent2 = 78;

        int FinalBalance = 2;
        int NumberOfCandies = (int) (FinalBalance / Candies);
        System.out.println(FinalBalance / Candies);
        int Spent3 = 0;

        int change = 2;
        System.out.println(OurMoney - Spent - Spent2 - Spent3);


    }
}

