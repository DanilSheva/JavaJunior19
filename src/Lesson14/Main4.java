package Lesson14;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main4 {
    public static void main(String[] args) {
        Coin coin1 = new  Coin (2.9, 1000 , 10);
        Coin coin2 = new  Coin (2.9, 1000, 10);
        Coin coin3 = new  Coin (2.5, 2000, 5);
        Coin coin4 = new  Coin (2.3 , 2010, 3);
        Coin coin5 = new  Coin (2.9 , 1000 , 3);

        LinkedHashSet<Coin> coins = new LinkedHashSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        for (Coin c : coins){
            System.out.println(c);

        }

    }
}
