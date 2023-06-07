public class Main {
    public static void main(String[] args) {
        QueueArray q = new QueueArray(6);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(6);
        q.enqueue(9);
        q.enqueue(7);
        q.enqueue(1);
        q.display();
//        try {
//            q.dequeue();
//            q.dequeue();
//            q.dequeue();
//        } catch (Exception e) {
//            System.out.println("Error: " + e);
//        }
        System.out.println();
//        q.display();
//        q.enqueue(2);
//        q.display();
    }
}

class QueueArray {
    private int front;
    private int rear;
    private int maxSize;
    private int[] queueArray;
    private int nItems;

    public QueueArray(int s) {
        this.rear = -1;
        this.front = 0;
        this.maxSize = s;
        this.queueArray = new int[s];
        this.nItems = 0;
    }

    public boolean isFull() {
        return this.maxSize == this.nItems;
    }

    public boolean isEmpty() {
        return this.nItems == 0;
    }

    public void enqueue(int number) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (this.rear == this.maxSize - 1) {
            this.rear = 0;
        } else {
            this.rear++;
        }
        this.queueArray[this.rear] = number;
        this.nItems++;
    }

    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is full");
        }
        int temp = this.queueArray[this.front];
        if (this.front == this.maxSize - 1) {
            this.front = 0;
        } else {
            this.front++;
        }
        this.nItems--;
        return temp;

    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return this.queueArray[this.front];
    }

    public int sizeOfQueue() {
        return this.nItems;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = this.front;
        while (i != this.rear) {
            System.out.print(this.queueArray[i] + " ");
            if (i == this.maxSize - 1) {
                i = 0;
            } else {
                i++;
            }
        }
        System.out.println(this.queueArray[this.rear]);
    }
}



/*
  return this.nItems == this.maxSize;

  return this.nItems == 0;

  if (isFull()) {
            System.out.println("Queue is empty");
            return;
        }
        if (this.rear == this.maxSize - 1) {
            this.rear = 0;
        } else {
            this.rear++;
        }
        this.queueArray[this.rear] = number;
        this.nItems++;
//        System.out.println("Value inserted");

  if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int temp=this.queueArray[this.front];
        if (this.front == this.maxSize - 1) {
            this.front = 0;
        } else {
            this.front++;
        }
        this.nItems--;
        return temp;

        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        return this.queueArray[this.front];



          return this.nItems;


           if (isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        int i=this.front;
        while (i!=this.rear){
            System.out.print(this.queueArray[i]+" ");
            if (i==this.maxSize-1){
                i=0;
            }else {
                i++;
            }
        }
        System.out.println(this.queueArray[this.rear]);
 */


