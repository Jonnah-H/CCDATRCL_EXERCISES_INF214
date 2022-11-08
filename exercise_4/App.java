import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        Queue<String> classmate = new LinkedList<>();
        Queue<String> classmate1 = new LinkedList<>();


        classmate.add("Nica");
        classmate.add("Winna");
        classmate.add("Neal");
        classmate.add("Mariel");
        classmate.add("James");

        System.out.println("INF 214 : " + classmate);

        System.out.println("The size of the queue : " + classmate.size());

        System.out.println("First Person is: " + classmate.peek());

        System.out.println("Removing " + classmate.remove());
        System.out.println("Removing " + classmate.remove());
        System.out.println("Removing " + classmate.remove());
        System.out.println("Removing " + classmate.remove());
        System.out.println("Removing " + classmate.remove());

        classmate1.add("Alliyah");
        classmate1.add("Jap");
        classmate1.add("Jenina");
        classmate1.add("Carlos");
        classmate1.add("Richael");

        System.out.println("NEW INF 214 : " + classmate1);

        System.out.println("The size of the queue : " + classmate1.size());

        System.out.println("First Person is: " + classmate1.peek());
    }
}
