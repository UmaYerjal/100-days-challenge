package Day77;

public class Linked_List_Cycle {
    public static class Node {
    
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;

        
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        Node temp = head.next;
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = temp;

        Linked_List_Cycle ll = new Linked_List_Cycle();

        System.out.println(ll.hasCycle(head));
    }
}
