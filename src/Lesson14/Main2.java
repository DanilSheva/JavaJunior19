package Lesson14;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("eee");
        list.add("qqq");
        list.add("www");

        // 1)  for - обычный цикл
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 2 ) foreach
        for (String s : list) {
            System.out.println(s);

        }
        // 3) С помощью итератора


        for (Iterator<String> iter = list.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());

        }
    }
}
