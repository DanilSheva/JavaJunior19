package HomeWork;

public class Lesson3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i += 1) {
            System.out.println(i);// все числа

        }
        for (int i = 20; i >= 0; i -= 1) {
            System.out.println(i); // все числа в обратном порядке

        }
        for (int i = 0; i <= 20; i += 1) {
            if (i % 2 == 0) {
                System.out.println(i); //  все четные числа

            }


        }
        for (int i = 0 ; i <= 20 ; i += 2){
            System.out.println(i); // все чеисла через один
        }
        int SumNumbers = 0;
        for (int i= 0 ; i <=20; i++ ){
            SumNumbers = SumNumbers + i;
        }
        System.out.println(SumNumbers);//  сумма всех чисел


    }
}
