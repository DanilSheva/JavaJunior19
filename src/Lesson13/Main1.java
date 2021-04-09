package Lesson13;

import java.util.concurrent.ThreadLocalRandom;

public class Main1 {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        IMatrix matrix = generate(rows, columns);

//        System.out.println(matrix.getRows());
//        System.out.println(matrix.getColumns());

        IMatrix matrix2 = generate(rows, columns);

        IMatrix add = matrix.add(matrix2);
        matrix.printToConsole();
        matrix2.printToConsole();
        add.printToConsole();
        IMatrix sub = matrix.sub(matrix2);
        sub.printToConsole();


    }

    private static IMatrix generate(int rows, int columns) {
        IMatrix matrix = new Matrix(rows, columns);
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                matrix.setValueAt(i, j, ThreadLocalRandom.current().nextInt( 20));
            }
        }
        return matrix;
    }
}
