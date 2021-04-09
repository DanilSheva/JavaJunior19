package lesson3;

public class main {
    public static void main(String[] args) {
        int mark = 4;
        switch (mark){
            case 1:
                System.out.println("Ужас");
                break;
            case 2:
                System.out.println("неуд");
                break;
            case 3:
                System.out.println("не очень");
                break;
            case 4:
                System.out.println("нормально");
                break;
            case 5:
                System.out.println("отлично");
                break;
            default:
                System.out.println("Это не оценка");
        }
    }
}
