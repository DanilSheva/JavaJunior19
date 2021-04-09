package Lesson15;

public class Main {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();
        holodilnik.addProduct("Слива", 5);
        holodilnik.addProduct("Яблоко",4);
        holodilnik.addProduct("Груша",9);


        holodilnik.addProduct("Слива",2);

        holodilnik.printAllProducts();

        holodilnik.getProduct("Яблоко" , 4);
        holodilnik.printAllProducts();
        System.out.println();
        System.out.println();

        Recept recept = new Recept("пирог", 30);
        recept.addIngridients("Груша", 4);
        recept.addIngridients("Слива",3);
        recept.addIngridients("Слива",3);

       recept.printAllIngridients();

       holodilnik.canCookDish(recept);


    }
}
