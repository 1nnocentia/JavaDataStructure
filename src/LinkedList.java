public class LinkedList {
    private Node head;

    class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void delete (int key) {
        if (head == null) return;

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
            current.next = current.next.next;
        }
    }

    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + "-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
