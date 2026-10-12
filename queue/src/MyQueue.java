public class MyQueue{

    Node head;
    Node tail;
    int size;

    void add(int data){
        Node temp = new Node(data);

        if(size == 0 ){
            head = tail = temp;
            size++;
        }

        tail.next = temp;
        tail = tail.next;
        size++;
    }

    int remove(){
        if(size == 0){
            System.out.println("Underflow..........");
            return -1;
        }

        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    int peek(){
        if(size == 0){
            System.out.println("Underflow..........");
            return -1;
        }
        return head.data;
    }

    void display(){
        Node current = head;
        System.out.print("[");
        while(current != null){
            System.out.print(current.data);
            current = current.next;
            if(current == null) break;
            else{
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}
