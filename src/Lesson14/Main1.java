package Lesson14;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList <String> linkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0 ; i <100000 ; i ++){
            arrayList.add("fdgdfd" + i);

        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения ArrayList Add " + (endTime - startTime));




        long startTime1 = System.currentTimeMillis();
        for (int i = 0 ; i <100000 ; i ++){
            linkedList.add("fdgdfd" + i);

        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Время выполнения LinkedList Add " + (endTime1 - startTime1));





        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000 ; i ++){
            arrayList.get(i);

        }
        long adTime2 = System.currentTimeMillis();
        System.out.println("Время выполнения Array get "+ (adTime2 - startTime2));

        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < 100000 ; i ++){
            linkedList.get(i);

        }
        long adTime3 = System.currentTimeMillis();
        System.out.println("Время выполнения linken get "+ (adTime2 - startTime2));
    }



}
