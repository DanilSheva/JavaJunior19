package Lesson12;

import java.util.ArrayList;

public class BlackJacGame {
    private ArrayList<Player>players = new ArrayList<>();
    private Koloda koloda = new Koloda();

    public void addPlayerToGame(Player player){
        players.add(player);

    }
    public void dealOfCards(){
        for (Player player : players){
            player.addCardToHand(koloda.randomCard());
            player.addCardToHand(koloda.randomCard());

        }
    }
    public void nextDealOfCards(){
        for (Player player:players){
            if (!player.areYouDealer()){
                player.printHand();

            }
            while (player.needsCard()){
                player.addCardToHand(koloda.randomCard());
                if (!player.areYouDealer()){
                    player.printHand();
                }

            }

        }

    }
    public void printWinner(){
        for (Player player:players){
            if (player.valueHand()>21){
                player.setInGame(false);

            }

        }
        if (countPlayersInGame()==0){
            System.out.println("--------Dealer Winner-------");
            return;

        }
        int valueWinner = 0;
        for (Player player : players){
            if (valueWinner < player.valueHand()&& player.isInGame()){
                valueWinner = player.valueHand();

            }

        }
        for (Player player : players){
            if (player.valueHand()==valueWinner){
                System.out.println("----------Winner---------");
                player.printHand();

            }

        }

    }
    public int countPlayersInGame(){
        int countPlayrs= 0;
        for (Player player : players){
            if(player.isInGame()){
                countPlayrs ++;

            }

        }
        return countPlayrs;
    }
}
