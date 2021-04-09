package Lesson12;

public class Dealer extends Player{
    @Override
    public boolean areYouDealer() {
        return true;
    }

    @Override
    public boolean needsCard() {
        int valueHand = this.valueHand();
        if (valueHand< 16){
            return true;

        }else {
            return false;
        }
    }
}
