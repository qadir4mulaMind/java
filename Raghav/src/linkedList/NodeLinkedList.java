package linkedList;

public class NodeLinkedList {
    public static void main(String[] args) {
        // 10 20 30 40 50
        /*Node a = new Node();
        a.val = 10;

        Node b = new Node();
        b.val = 20;

        Node c = new Node();
        c.val = 30;

        Node d = new Node();
        d.val = 40;

        Node e = new Node();
        e.val = 50;

        // Connect karenge (link karenge)

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;*/

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        System.out.println(a.val);
        System.out.println(a.next);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(a + "\n");
        System.out.println(a.next);
        System.out.println(b + "\n");
        System.out.println(b.next);
        System.out.println(c + "\n");
        System.out.println(c.next);
        System.out.println(d + "\n");
        System.out.println(d.next);
        System.out.println(e);

        System.out.println(a.next.next.next.val);
    }
}