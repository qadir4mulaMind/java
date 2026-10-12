import java.util.LinkedList;
import java.util.Queue;

public class QueueTraverse {

    // FIX: Store q.size() in a variable so it iterates through all elements safely
    private static void display(Queue<Integer> q){
        int n = q.size();
        for(int i = 0 ; i < n; i++){
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.print("Initial Queue: ");
        display(q);

        System.out.print("After adding 60 at index 2: ");
        addAtIndex(2, 60, q);
        display(q);

        System.out.println("Peek front element: " + peek(q));

        System.out.println("Removed element at index 2: " + remove(2, q));
        System.out.print("Queue after removal: ");
        display(q);
    }

    // Solution for remove at index
    private static int remove(int idx, Queue<Integer> q) {
        if (idx < 0 || idx >= q.size()) {
            System.out.println("Invalid Index");
            return -1;
        }

        int n = q.size();
        // Rotate elements before the target index to the back
        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }

        // Remove and capture the target element
        int removedValue = q.remove();

        // Rotate the remaining original elements back to maintain order
        for (int i = 0; i < n - idx - 1; i++) {
            q.add(q.remove());
        }

        return removedValue;
    }

    // Solution for peek
    private static int peek(Queue<Integer> q) {
        if (q.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return q.peek();
    }

    private static void addAtIndex(int idx, int val, Queue<Integer> q) {
        if(idx < 0 || idx > q.size()){
            System.out.println("Invalid Index");
            return;
        }
        int n = q.size();
        for(int i = 0; i < idx; i++){
            q.add(q.remove());
        }
        q.add(val);
        for(int i = 0; i < n - idx; i++){
            q.add(q.remove());
        }
    }
}
