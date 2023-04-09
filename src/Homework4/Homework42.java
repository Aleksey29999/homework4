//Реализуйте очередь с помощью LinkedList со следующими методами:
//        • enqueue() — помещает элемент в конец очереди,
//        • dequeue() — возвращает первый элемент из очереди и удаляет его,
//        • first() — возвращает первый элемент из очереди, не удаляя.

package Homework4;
import java.util.LinkedList;

public class Homework42 {
    public static void run() {
        LinkedList<Integer> collecion = new LinkedList<Integer>();
        collecion.add(100);
        collecion.add(20);
        collecion.add(3);
        collecion.add(1000);
        System.out.println(collecion+ " -исходный список");

        enqueue(collecion, 1);
        System.out.println(collecion + " -добавлениее в конце списка элемента ");

        System.out.println(dequeue(collecion) + " -первый элемент списка");
        System.out.println(collecion + " -список без первого элемента");

        System.out.println(first(collecion) + " -первый элемент списка без удаления" );
        System.out.println(collecion + " -список без удаления первого элеента ");
    }

    public static void enqueue(LinkedList<Integer> collecion, int num) {
        collecion.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> collecion) {
        int num = 0;
        num = collecion.get(0);
        collecion.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> collecion) {
        int num = 0;
        num = collecion.get(0);
        return num;
    }
}
