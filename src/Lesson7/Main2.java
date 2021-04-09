package Lesson7;

public class Main2 {
    public static void main(String[] args) {
        int [] [] numbers1 = {{2,3,4},
                             {5,6,7},
                             {8,9,0}};




        int [] [] numbers2 = {{2,4,7},
                              {6,6,3},
                              {2,7,9}};

       boolean check= MatrixUtils.isSquareMatrix(numbers1);
        System.out.println(check);

        boolean identity = MatrixUtils.isIdentityMatrix(numbers1);
        System.out.println(identity);


    }
}
