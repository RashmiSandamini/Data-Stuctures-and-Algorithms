public class Main {
    public static void main(String[] args) {
        LinkedList k = new LinkedList();
//        k.insertMiddle(1,3);
        k.insertFirst(2);
        k.insertFirst(5);
        k.insertFirst(7);
        k.insertFirst(1);
        k.insertFirst(9);
//        k.insertMiddle(2, 6);
        k.displayList();
//        Node x = k.find(2);
//        k.deleteLast();
        k.insertLast(3);
        k.displayList();
        k.insertMiddle(2, 6);
        k.displayList();
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public void displayNode() {
        System.out.print(this.data + " ");
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void insertFirst(int item) {
        Node newNode = new Node(item);
        newNode.next = this.head;
        this.head = newNode;
    }

    public Node deleteFirst() {
        if (isEmpty()) {
            System.out.println("List empty");
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        return temp;
    }

    public void displayList() {
        if (isEmpty()) {
            System.out.println("List empty");
            return;
        }
        Node current = this.head;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public Node find(int key) {
        if (isEmpty()) {
            System.out.println("List empty");
            return null;
        }
        Node current = this.head;
        int count = 1;
        while (current != null) {
            if (count == key) {
                return current;
            }
            current = current.next;
            count++;
        }
        System.out.println("Entered data not in the list");
        return null;
    }

    public void delete(int key) {
        if (isEmpty()) {
            System.out.println("List empty");
            return;
        }
        Node current, previous;
        current = this.head;
        previous = this.head;
        int count = 1;
        while (current != null) {
            if (count == key) {
                if (key == 1) {
                    this.head = current.next;
                } else {
                    previous.next = current.next;
                }
            }
            previous = current;
            current = current.next;
            count++;
        }
        System.out.println("Not found in the list");
    }

    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("List empty");
            return;
        }
        if (this.head.next == null) {
            this.head = null;
            return;
        }
        Node current = this.head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;

    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        Node current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertMiddle(int position, int data) {
        Node newNode = new Node(data);
        Node current = this.head;

        if (position == 1) {
            insertFirst(data);
        } else if (position < 1) {
            System.out.println("Invalid position");
        } else {
            position--;
            while (position != 1) {
                if (current == null) {
                    System.out.println("Invalid position");
                    return;
                }
                current = current.next;
                position--;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
}