class CircularQueue {
    int[] arr;
    int f;
    int r;
    int size;
    int capacity;


    CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        f = -1;
        r = -1;
        size = 0;
    }


    void add(int val) {
        // Case 1: Queue Full Check
        if (size == capacity) {
            System.out.println("Hey, Queue is already full! Cannot add " + val);
            return;
        }


        if (size == 0) {
            f = 0;
            r = 0;
        } else {

            r = (r + 1) % capacity;
        }

        arr[r] = val;
        size++;
    }


    int remove() {
        // Case 1: Empty Queue Check
        if (size == 0) {
            System.out.println("Hey, Queue is already empty!");
            return -1;
        }

        int val = arr[f];


        f = (f + 1) % capacity;
        size--;


        if (size == 0) {
            f = -1;
            r = -1;
        }

        return val;
    }


    int peek() {
        if (size == 0) {
            System.out.println("Hey, Queue is empty!");
            return -1;
        }
        return arr[f];
    }


    void display() {
        if (size == 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < size; i++) {
            int index = (f + i) % capacity;
            System.out.print(arr[index]);

            if (i < size - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");
    }
}

public class CircularArrayQueue {
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        System.out.println("--- Adding elements ---");
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);


        q.add(60);

        q.display();

        System.out.println("\n--- Removing elements ---");
        System.out.println("Removed: " + q.remove());
        System.out.println("Removed: " + q.remove());

        q.display();

        System.out.println("\n--- Testing Wrap-around (Circular behavior) ---");
        q.add(70);
        q.add(80);

        q.display();

        q.add(90);
    }
}
