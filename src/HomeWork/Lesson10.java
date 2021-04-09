package HomeWork;

public class Lesson10 {
    public static void main(String[] args) {
        String text = "my name is Danil.";
        String[] arrayText = text.split("");
        System.out.println();
        for (int i = 0; i < arrayText.length; i++) {
            if (arrayText[i] == "y" || arrayText[i] == "a" || arrayText[i] == "e" || arrayText[i] == "i") {
                System.out.println(arrayText[i]);
            }

        }


    }
}
