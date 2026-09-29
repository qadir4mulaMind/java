package linkedList;

import java.util.Scanner;

class LinkedList{ //  user defined data structure
    Node head = null; // null
    Node tail = null; // null
    int size;

    void addAtTail(int val){
        Node t = new Node(val);
        if(head == null) head = tail = t;
        else {
            tail.next = t;
            tail = t;
        }
        size++;
    }

    int get(int idx){
        if(idx < 0 || idx == size){
            System.out.println("Please provide a valid index");
            return -1;
        }
        Node current = head;
        for(int i = 0; i < idx; i++) current = current.next;
        return current.val;
    }

    void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    void addAtHead(int val){
        Node t = new Node(val);
        if(head == null) head = tail = t;
        else {
            t.next = head;
            head = t;
        }
        size++;
    }

    void deleteAtHead(){
        if(head == null){
            System.out.println("Linked List is empty.");
            return;
        }
        head  = head.next;
        if(head == null) tail = null;
        size--;
    }

    int search(int target){
        if(head == null){
            System.out.println("linked list is empty");
            return -1;
        }
        int idx = 0;
        Node current = head;
        while(current != null){
            if(current.val == target)return idx;
            current = current.next;
            idx++;
        }
        return -1;
    }

    void insert(int idx, int val) {
        if (idx < 0 || idx > size) {
            System.out.println("Please provide a valid index.");
            return;
        } else {
            if (idx == 0) {
                addAtHead(val);
                return;
            } else if (idx == size) {
                addAtTail(val);
                return;
            } else {
                Node current = head;
                for (int i = 0; i < idx - 1; i++) {
                    current = current.next;
                }
                Node t = new Node(val);
                t.next = current.next;
                current.next = t;
                size++;
            }
        }
    }

    void delete(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Deletion is not possible.");
            return;
        }
        if (idx == 0) {
            deleteAtHead();
            return;
        } else {
            Node current = head;
            for (int i = 0; i < idx - 1; i++) {
                current = current.next;
            }
            Node t = current.next;
            current.next = t.next;

            if (idx == size - 1) {
                tail = current;
            }
            size--;
        }
    }
}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        // ll.deleteAtHead(); --> empty;

        System.out.print("Enter size of linked list: ");
        int n = input.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print("Enter " + i + " element: ");
            ll.addAtTail(input.nextInt());
        }
        ll.display();

        System.out.print("Enter index you want to delete the element: ");
        int idx = input.nextInt();
        ll.delete(idx);

        ll.display();

        /*System.out.print("Enter index you want to insert the element: ");
        int i = input.nextInt();
        System.out.print("Enter value you want to insert: ");
        int ele = input.nextInt();
        ll.insert(i, ele);*/
        // System.out.println(ll.get(2));

        // ll.display();

        /*System.out.print("Enter target: ");
        int target = input.nextInt();

        System.out.println("Element " + target + " found at "+  ll.search(target) + " index.");*/

        /*ll.display();
        System.out.println(ll.head.val);
        System.out.println(ll.tail.val);
        System.out.println(ll.size);


        ll.addAtHead(input.nextInt());
        ll.display();
        System.out.println(ll.size);
        System.out.println(ll.head.val);
        System.out.println(ll.tail.val);
        System.out.println(ll.size);

        ll.deleteAtHead();
        ll.display();

        System.out.println(ll.size);*/
    }
}