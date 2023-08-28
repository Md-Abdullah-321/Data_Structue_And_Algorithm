
class LinkedList {
    Node head;
    private int size;

    LinkedList() {
        this.size = 0;
    }
    
    //Create A Node:
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    //add - first:
    public void addFirst(String data) {
        Node newNode = new Node(data);

        size++;
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        size++;
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }

    //Print Node:
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    //Delete Node:
    //Delete First:
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    
    //Delete Last:
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node LastNode = head.next;

        while (LastNode.next != null) {
            LastNode = LastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    //Length of Linkedlist:
    public int getSize() {
        return size;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast("MD Abdullah");
        list.addLast("Aiman Ahmed");
        list.addLast("Ismail Khondokar");

        list.printList();
        System.out.println(list.getSize());
    }
}