package Day77;

public class Middle_Of_The_Linked_List {

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

    public void print(Node head){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Middle_Of_The_Linked_List ll = new Middle_Of_The_Linked_List();

        Node newhead = ll.middleNode(head);
        ll.print(newhead);

    }
    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
