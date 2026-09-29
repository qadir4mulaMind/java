package linkedList;

import java.util.Scanner;

public class InputLinkedList {
    public static void display(Node haed){
        Node current = haed;

        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void displayRec(Node head){
        if(head == null) return;
        System.out.print(head.val + " ");
        displayRec(head.next);
    }

    public static void display2(Node head){
        if(head == null) return;
        display2(head.next);
        System.out.print(head.val + " ");
    }

    private static int get(Node head, int idx){
        // Node temp = head
        for(int i = 1; i < idx; i++){
            head = head.next;
        }
        return head.val;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Node a = new Node(input.nextInt());
        Node b = new Node(input.nextInt());
        Node c = new Node(input.nextInt());
        Node d = new Node(input.nextInt());
        Node e = new Node(input.nextInt());

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
        displayRec(a);
        System.out.println();
        display2(a);
        System.out.println();

        System.out.println(get(a, 4));
    }
}