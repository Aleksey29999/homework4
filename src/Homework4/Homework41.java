
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.


package Homework4;

import java.util.Collections;
import java.util.LinkedList;

public class Homework41 {
    public static void run() {
        LinkedList<Integer> collecion = new LinkedList<Integer>();
        collecion.add(5);
        collecion.add(500);
        collecion.add(200);
        collecion.add(300);
        System.out.println(collecion);
        Collections.reverse(collecion);
        System.out.println(collecion);
    }

}
