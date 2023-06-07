public class DoublyLinkedList {

    public static void main(String[] args) {
        DDL d = new DDL();
        d.insertFirst(2);
        d.insertFirst(6);
        d.insertFirst(1);
        d.insertFirst(9);
        d.insertMiddle(3, 4);
        d.displayList();
//        d.delete(2);
        System.out.println();
        d.insertMiddle(6, 8);
        d.displayList();

    }
}

class NodeD {
    int data;
    NodeD next;
    NodeD previous;

    NodeD(int item) {
        this.data = item;
        this.next = null;
        this.previous = null;
    }

    void displayNodeD() {
        System.out.print(this.data + " ");
    }
}

class DDL {
    private NodeD head;
    private NodeD tail;

    public DDL() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void insertFirst(int item) {
        NodeD newNode = new NodeD(item);
        if (isEmpty()) {
            this.head = this.tail = newNode;
            this.head.previous = null;
            this.tail.next = null;
            return;
        }
        //adding nodes to the end of the linked list
        this.tail.next = newNode;
        newNode.previous = this.tail;
        this.tail = newNode;
        this.tail.next = null;

        //adding nodes at the beginning of the linked list
//        newNode.next=this.head;
//        this.head.previous=newNode;
//        this.head=newNode;
//        this.head.previous=null;
    }

    public NodeD deleteFirst() {
        if (isEmpty()) {
            System.out.println("List empty");
            return null;
        }
        if (this.head == this.tail) {
            this.head = this.tail = null;
            return null;
        }
        NodeD temp = this.head;
        this.head = this.head.next;
        return temp;
    }

    public void displayList() {
        NodeD current = this.head;
        if (this.head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        while (current != null) {
            current.displayNodeD();
            current = current.next;
        }
    }

    public NodeD find(int key) {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
            return null;
        }
        NodeD current = this.head;
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
        NodeD current = this.head;
        int count = 1;
        while (current != null) {
            if (key == count) {
                if (current == this.tail) {
                    deleteLast();
                    return;
                }
                current.previous.next = current.next;
                current.next.previous = current.previous;
            }
            current = current.next;
            count++;
        }
        System.out.println("Key values is not in the linked list");
        return;
    }

    public void deleteLast() {
        this.tail = this.tail.previous;
        this.tail.next = null;
    }

    public void insertMiddle(int position, int data) {
        NodeD current = head;
        NodeD newNode = new NodeD(data);
        if (position == 1) {
            insertFirst(data);
        } else if (position < 1) {
            System.out.println("Invalid position.Entered position is less than one");
        } else {
            position--;
            while (position != 1) {
                if (current == null) {
                    System.out.println("Invalid position.Entered position does not exist in the linked list");
                    return;
                }
                current = current.next;
                position--;
            }
            if (current == this.tail) {
                this.tail = newNode;
            }
            newNode.next = current.next;
            newNode.previous = current;
            current.next = newNode;
        }

    }
}