import java.util.Scanner;

class DeleteAtAnyIndex {
    Node head;

    //create a node:
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //add - last:
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

    //Delete at position:
    public Node deletePosition(Node head, int position) {
        if (position <= 0 || head == null) {
            return head;
        }
        // if (position == 1) {
        //     head = head.next;
        //     return head;
        // }

        Node currNode = head;
        for (int i = 0; i < position - 1 && currNode != null; i++) {
            currNode = currNode.next;
        }

        if (currNode == null || currNode.next == null) {
            return head;
        }

        currNode.next = currNode.next.next;
        return head;
    }
    
    //print list:
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            DeleteAtAnyIndex list = new DeleteAtAnyIndex();
            int n = input.nextInt();

            for (int i = 0; i < n; i++) {
                list.addLast(input.nextInt());
            }

            int d = input.nextInt();
            list.deletePosition(list.head, d);

            list.printList();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}