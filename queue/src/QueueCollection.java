import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q1 = new ArrayDeque<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.peek());

        q.remove();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());

    }
}
