package lesson1;

public class MySecondProgramm {
    public static void main(String[] args) {
        double shirinaRoom = 9.5;
        double dlinaroom = 5;

        double shirinaTable = 4;
        double dlinaTable = 2.4;


        double plochadRoom = shirinaRoom * dlinaroom;
        double ploshadTable = shirinaTable * dlinaTable;

        double tablesToInsertToRoom = plochadRoom / ploshadTable;
        System.out.println("столов влезет в комнату: " + tablesToInsertToRoom );

    }
}
