package Lesson6;

public class StringUtils {
    public static int countWords(String text) {
        // привет , меня зовут Данил а тебя ?
        String[] words = text.split(" ");
        return words.length;
    }

    public static void whatsIsFile(String path) {
        if (path.endsWith("png") || path.endsWith("jpg") || path.endsWith("jpeg")) {
            System.out.println("Это картинка");

        } else if (path.endsWith("muvi") || path.endsWith("mp4")) {
            System.out.println("Это видео");

        } else if (path.endsWith("exe")) {
            System.out.println("Это программа");

        } else {
            System.out.println("Это какой то файл");
        }
    }

    public static void reverse(String text) {
        char[] simbolsIsFromText = text.toCharArray();
        for (int i = simbolsIsFromText.length - 1; i >= 0; i--) {
            System.out.print(simbolsIsFromText[i]);

        }
        System.out.println();


    }

    public static void replaceFirstWorldsSymbolWithUpper(String text) {
        char[] charsFromText = text.toCharArray();
        System.out.print(Character.toUpperCase(charsFromText[0]));
        for (int i = 1; i < charsFromText.length; i++) {
            System.out.print(charsFromText[i]);
            if (charsFromText[i] == ' ') {
                charsFromText[i + 1] = Character.toUpperCase(charsFromText[i + 1]);

            }

        }

    }

}






