package Lesson12;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private boolean inGame = true;


    private ArrayList<Card> hand = new ArrayList<>();

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void addCardToHand(Card card){
        hand.add(card);


    }
    public boolean areYouDealer(){
        return false;
    }
    public void printHand(){
        System.out.println("/---------Карты игрока");
        for (Card card : hand){
            System.out.println(card);

        }
        System.out.println("/----------");
    }
    public boolean needsCard(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вам нужна еще одна карта ? (да / нет)");
        String answer = scanner.nextLine();
        if (answer.equals("да")){
            return true;

        }else {
            return false;
        }
    }
    public int valueHand(){
        int value= 0 ;
        for (Card card:hand){
            value =value + card.getValue();

        }
        return value;
    }



}
