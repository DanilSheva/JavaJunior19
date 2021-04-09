package lesson4;

public class Main6 {
    public static void main(String[] args) {
        String email = "gdhryjw@wh.com";

        String[] partsOfEmail = email.split("@");
        System.out.println();
        if (partsOfEmail.length != 2) {
            System.out.println(" mail не подходит. неверное кол-во собачек");
            return;

        }
        if (!partsOfEmail[1].contains(".")) {
            System.out.println(" mail не подходит. нет точки");
            return;

        }
        if (email. startsWith(".") || email.endsWith(".")){
            System.out.println( "email не подходит . начинается или заканчивается на точку ");
            return;


        }
        String [] partsPerPoint = email. split("//.");
        String lastPart = partsPerPoint [partsPerPoint.length - 1];
    }
}