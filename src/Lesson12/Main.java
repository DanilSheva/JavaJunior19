package Lesson12;

public class Main {
    public static void main(String[] args) {


        Player player = new Player();
        Dealer dealer = new Dealer();

        BlackJacGame game = new BlackJacGame();
        game.addPlayerToGame(player);
        game.addPlayerToGame(dealer);

        game.dealOfCards();
        game.nextDealOfCards();
       game.printWinner();



    }
}
