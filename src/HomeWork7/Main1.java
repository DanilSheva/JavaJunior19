package HomeWork7;

public class Main1 {
    public static void main(String[] args) {
        int aLength = 8;
        int bLength = 8;
        int value = 2;


        int[][] numbers = new int[aLength][bLength];



        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
               numbers [i][j] = value;
               value += 2 ;
            }
        }
        for (int[] number : numbers) {
            for (int j = 0; j < number.length; j++) {
                System.out.print(number[j] + " ");
            }
            System.out.println();
        }




    }
}

