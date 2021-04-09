package HomeWork7;

public class Main3 {
    public static void main(String[] args) {
        int aLength = 8;
        int bLength = 8;
        int value = 2;


        int[][] numbers = new int[aLength][bLength];


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = value;
                value += 2;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");

                } else
                    System.out.print("   ");


            }
            System.out.println();
        }


    }
}



