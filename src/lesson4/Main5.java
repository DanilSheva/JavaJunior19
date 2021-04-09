package lesson4;

public class Main5 {
    public static void main(String[] args) {
        String text = "I am programmer";

        int lengthOfText = text.length();
        System.out.println(lengthOfText);

        String newText = text.replace('a', 'A');
        System.out.println(text);
        System.out.println(newText);
    }
}
