package Day75;
/*
Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:
Input: head = [1,2]
Output: [2,1]

 */
public class Reverse_Linked_List {
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

    public void print(){
        Node temp = head;
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
        return;
    }
    
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while ( curr  != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Reverse_Linked_List ll = new Reverse_Linked_List(); 

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        ll.print();
        ll.reverse();
        ll.print();
    }
}
