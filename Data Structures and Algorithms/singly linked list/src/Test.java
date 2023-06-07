public class Test {
    /*
    public class Main {
    public static void main(String[] args) {
        LinkedList k = new LinkedList();
//        k.insertMiddle(1,3);
        k.insertFirst(2);
        k.insertMiddle(2, 6);
        k.displayList();

    }
}

class Node {
    int data;
    Node next;

    Node(int item) {
        this.data = item;
        this.next = null;
    }

    void displayNode() {
        System.out.println(this.data + " ");
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertFirst(int item) {
        Node newNode = new Node(item);
        newNode.next = this.head;
        this.head = newNode;
    }

    public Node deleteFirst() {
        if (isEmpty()) {
            System.out.println("LinkedList is empty.Cannot perform deletion");
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        return temp;
    }

    public void displayList() {
        if (isEmpty()) {
            System.out.println("LinkedList is empty.");
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
            System.out.println("LinkedList is empty");
            return null;
        }
        Node current = this.head;
        int count = 1;
        while (current != null) {
            if (key == count) {
                return current;
            }
            current = current.next;
            count++;
        }
        System.out.println("Key value is out of the linked list");
        return null;
    }

    public void delete(int key) {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
            return;
        }
        Node current, previous;
        current = head;
        previous = head;
        int count = 1;
        while (current != null) {
            if (count == key) {
                if (key == 1) {
                    this.head = this.head.next;
                } else {
                    previous.next = current.next;
                }
            }
            previous = current;
            current = current.next;
            count++;
        }
        System.out.println("Item not available for the deletion");
    }

    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
        } else if (this.head.next == null) {
            this.head = null;
        } else {
            Node current, previous;
            current = this.head;
            previous = this.head;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
        }
    }

    public void insertLast(int data) {
        if (isEmpty()) {
            insertFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertMiddle(int position, int data) {
        Node temp = head;
        Node newNode = new Node(data);
        if (position == 1) {
            insertFirst(data);
        } else if (position < 1) {
            System.out.println("Invalid position.Entered position is less than one");
        } else {
            position--;
            while (position != 1) {
                if (temp.next == null) {
                    System.out.println("Invalid position.Entered position does not exist in the linked list");
                    return;
                }
                temp = temp.next;
                position--;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
}
     */
}
