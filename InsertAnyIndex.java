public class InsertAnyIndex {
    Node head;

    //create a Node class:
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int index, int data) {
        Node node = new Node(data);

        if (index == 1) {
            node.next = head;
            head = node;
        } else {
            Node prevNode = head;
            int count = 1;

            while (count < index - 1) {
                prevNode = prevNode.next;
                count++;
            }

            Node curNode = prevNode.next;
            prevNode.next = node;
            node.next = curNode;
        }
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
        InsertAnyIndex list = new InsertAnyIndex();

        list.insert(1, 10);
        list.insert(2, 30);
        list.insert(2, 20);

        list.printList();
    }
}
