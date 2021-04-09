package Lesson6;

public class Main {
    public static void main(String[] args) {
        int countWords = StringUtils.countWords("привет , меня зовут Данил а тебя ?");
        System.out.println(countWords);

        StringUtils.whatsIsFile("gnjdgjdvn.png");
        StringUtils.reverse("как дела");
        StringUtils.replaceFirstWorldsSymbolWithUpper("привет. я програмист");

    }
}
