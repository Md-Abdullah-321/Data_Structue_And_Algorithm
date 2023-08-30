public class Reverse {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    //add - last
    public void addLast(int data) {
        Node newNode = new Node(data);

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
    //reverse linkedlist:
    public void reverse() {
        Node prevNode = head;
        Node currNode = head.next;

        if (head == null || head.next == null) {
            return;
        }

        while (currNode != null) {
            Node nexNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nexNode;
        }
        head.next = null;
        head = prevNode;
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

    public static void main(String[] args) {
        Reverse list = new Reverse();

        list.addLast(0);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.reverse();

        list.printList();
    }
}
