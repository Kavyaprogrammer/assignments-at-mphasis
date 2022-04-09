package LinkedList;


public class Main{
 
    private Node head;
 
    private static class Node {
        private int value;
        private Node next;
 
        Node(int value) {
            this.value = value;
 
        }
    }
 
    public void addToTheLast(Node node) {
 
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
 
            temp.next = node;
        }
    }
 
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }
 
    public Node nthFromLastNode(Node head,int n)
    {
        Node firstPtr=head;
        Node secondPtr=head;
 
        for (int i = 0; i < n; i++) {
            firstPtr=firstPtr.next;
 
        }
 
        while(firstPtr!=null)
        {
            firstPtr=firstPtr.next;
            secondPtr=secondPtr.next;
        }
 
        return secondPtr;
    }
 
    public static void main(String[] args) {
        Main list = new Main();
        // Creating a linked list
        Node head=new Node(5);
        list.addToTheLast(head);
        list.addToTheLast(new Node(3));
        list.addToTheLast(new Node(8));
        list.addToTheLast(new Node(9));
        list.addToTheLast(new Node(7));
 
        list.printList();
        // Finding 3rd node from end
        Node nthNodeFromLast= list.nthFromLastNode(head,2);
        System.out.println("3th node from end is : "+ nthNodeFromLast.value);
 
    }
 
}