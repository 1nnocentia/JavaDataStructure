public class LinkedList {
    private Node head; //declare head as first node in linked list and only could be use in linkedlink class

    class Node { //innerclass: element in linked list
        int data; //store node value
        Node next; //store next node reference

        //constructor
        Node (int data) { //fill data value and set next=null
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data); //made new node
        newNode.next = head; //connect new node to head 
        head = newNode; //new node now is head
    }

    public void delete (int key) {
        if (head == null) return; //if linked list is empty, return and do nothing

        //if head is to be deleted
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;     
        }

        if (current.next != null) {
            current.next = current.next.next; //connect the current.next to current.next.next so that current.next is deleted
        }
    }

    public void traverse() { //display linked list
        Node current = head; //start with head
        while (current != null) { //stop when null
            System.out.print(current.data + "-> ");
            current = current.next; //move to next node
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        System.out.println("Sebelum di hapus: ");
        list.traverse();

        list.delete(20);

        System.out.println("Setelah di hapus: ");
        list.traverse();
    }
}
