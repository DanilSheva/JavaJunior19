package Lesson13;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Matrix implements IMatrix {
    private double[][] numbers;

    public Matrix(int row, int column) {
        numbers = new double[row][column];
    }

    @Override
    public int getRows() {
        return numbers.length;
    }


    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        numbers[rowIndex][colIndex] = value;

    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        Matrix sumMatrix = new Matrix(3, 3);
        for (int i = 0; i < sumMatrix.getRows(); i++) {
            for (int j = 0; j < sumMatrix.getColumns(); j++) {
                sumMatrix.setValueAt(i, j, getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return sumMatrix;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        Matrix sumMatrix = new Matrix(3, 3);
        for (int i = 0; i < sumMatrix.getRows(); i++) {
            for (int j = 0; j < sumMatrix.getColumns(); j++) {
                sumMatrix.setValueAt(i, j, getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return sumMatrix;

    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() {
        System.out.println(toString());

    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.append(" ").append(getValueAt(i, j));
            }
            result.append("\n");
        }
        return result.toString();
    }
}
