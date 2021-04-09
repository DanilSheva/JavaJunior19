package Lesson6;

public class NumbersUtils {
    /**
     * 1 - Модификатор доступа
     * public (доступ везде внутри данного проекта)
     * ___________ (доступ внутри текущей папки)
     * protected (доступ внутри текущего класса и его наследникам)
     * private  (доступ внутри текущего класса)
     * 2 - static (ибо ставим его , лобо нет )
     * 3 - возвращаемый тип (или слово void)
     * название метода всегда с маленькой буквы
     * 5 - входящие пораметры в () или просто () если их нет
     * 6 идет тело выполнения метода
     */


    public static int minNum(int a, int b, int c) {
        if (a < b && a < c) {
            return a;

        }

        if (b < a && b < c) {
            return b;

        }
        return c;

    }

    public static String figure(String a, String b, String c, String d) {
        if (a == b && b == c && c == d) {

            return "квадрат";
        }
        if (a == b && c == d && a != c) {
            return "это прямоугольник";
        }
        return "четырехугольник";


    }
    }





