package in.qadir.varargs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TestingQueue
{
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.offer(2);

        Utility.print(q);

        System.out.println(q.peek());
        System.out.println(q.element());
        System.out.println(q.remove());

        Utility.print(q);
        System.out.println(q.poll());
        System.out.println(q.poll());
    }
}