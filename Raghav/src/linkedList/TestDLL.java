package linkedList;

class ListNode{
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int val){
        this.val = val;
    }
}

class DLL{
    ListNode head;
    ListNode tail;
    int size = 0;

    void insertAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head == null && tail == null) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertAtTail(int val){
        ListNode temp = new ListNode(val);
        if(head == null && tail == null) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    int deleteAtHead(){
        if(size == 0) {
            System.out.println("Linked list is empty.");
            return -1;
        }else if(size == 1) {
            int data = head.val;
            head = tail = null;
            size--;
            return data;
        } else{
            int data = head.val;
            head = head.next;
            head.prev = null;
            size--;
            return data;
        }
    }

    int deleteAtTail(){
        if(size == 0){
            System.out.println("Linked list is empty");
            return -1;
        } else if(size == 1) {
            int data = head.val;
            head = tail = null;
            size--;
            return data;
        }else{
            int data = tail.val;
            tail = tail.prev;
            tail.next = null;
            size--;
            return data;
        }
    }

    void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayReverse(){
        ListNode temp = tail;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    void insertAt(int idx, int val){
        if(idx < 0 || idx > size){
            System.out.println("Invalid insertion");
            return;
        }

        else if(idx == 0){
            insertAtHead(val);
        }

        else if(idx == size){
            insertAtTail(val);
            return;
        }
        else{
            ListNode a = new ListNode(val);
            ListNode temp = head;
            for(int i = 0; i < idx - 1; i++) temp = temp.next;

            a.next = temp.next;
            a.prev = temp;
            temp.next.prev = a;
            temp.next = a;
            size++;
        }
    }

    int getAt(int idx){
        if(idx < 0 || idx >= size){
            System.out.println("Invalid index");
            return -1;
        }
        ListNode temp = head;
        for(int i = 0; i < idx; i++)
            temp = temp.next;
        return temp.val;
    }

    void deleteAt(int idx){
        if(idx < 0 || idx >= size){
            System.out.println("Invalid deletion");
            return;
        }

        if(idx == 0){        // delete head
            if(size == 1){
                head = tail = null;
            }else{
                head = head.next;
                head.prev = null;
            }
            size--;
            return;
        }

        if(idx == size - 1){   // delete tail
            tail = tail.prev;
            tail.next = null;
            size--;
            return;
        }

        ListNode temp = head;
        for(int i = 0; i < idx; i++)
            temp = temp.next;

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;
    }
}

public class TestDLL{
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtHead(50);
        list.display();
        list.insertAtTail(60);
        list.display();
        list.displayReverse();
        list.deleteAtTail();
        list.display();
        list.deleteAtHead();
        list.display();
        list.insertAt(1, 90);
        list.display();
        list.deleteAt(2);
        list.display();
        System.out.println(list.getAt(1));
    }
}