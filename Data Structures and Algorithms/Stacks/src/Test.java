public class Test {
    public static void main(String[] args) {
//        Stack s = new Stack(5);
//        s.push(2);
//        s.push(23);
//        s.push(45);
//        s.push(14);
//        s.push(9);
////        s.push(9);
//        try {
//            s.pop();
//        } catch (Exception e) {
//            System.out.println("Error: " + e);
//        }
//        s.display();

        Test t = new Test();
        t.conversion(50);
    }

    public void conversion(int number) {
        int temp = number;
        int x;

        int count = 1;
        while (temp != 0) {
            temp = temp / 2;
            count++;
        }
        Stack s = new Stack(count);
        temp=number;
        while (temp != 0) {
            x = temp % 2;
            temp = temp / 2;
            s.push(x);
        }
        s.display();
        System.out.println();
        while (!s.isEmpty()){
            try {
                System.out.print(s.pop()+" ");
            }catch (Exception e){
                System.out.println("Error: "+e);
            }
        }
    }
}

class Stack {
    private int top;
    private int maxSize;
    private int[] stackData;

    public Stack(int s) {
        this.top = -1;
        this.maxSize = s;
        this.stackData = new int[s];
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == this.maxSize - 1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        this.stackData[++this.top] = item;
    }


    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        int temp = this.stackData[this.top];
        this.top--;
        return temp;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return this.stackData[this.top];
    }

    public void display() {
        for (int i = 0; i <= this.top; i++) {
            System.out.print(stackData[i]+" ");
        }
    }
}

/*
public class Queue {
    private int maxSize;

    private int[] queData;

    private int head;//front

    private int tail;//rear

    private int nItems;

    public Queue(int size){
        this.maxSize=size;
        this.head = this.tail = -1;
        this.queData = new int[this.maxSize];
        this.nItems = 0;
    }
    public void enQueue(int item){
        if(this.isFull()){
            System.out.println("Queue if full");
            return;
        }
        if(this.isEmpty()){
            this.head = this.tail = 0;
        }
        else{
            this.tail = (this.tail+1)%this.maxSize;
        }
        this.queData[this.tail] = item;
        this.nItems++;
    }
    public int deQueue(){
        if(this.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int data = this.queData[this.head];
        if(this.nItems==1){
            this.head = this.tail = -1;
        }else{
            this.head = (this.head+1)%this.maxSize;
        }
        this.nItems--;
        return data;
    }
    public int peek(){
        if(this.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return this.queData[this.head];
    }
    public boolean isEmpty(){
        return this.nItems==0;
    }
    public boolean isFull(){
        return this.nItems==this.maxSize;
    }
    public int nItems(){
        return this.nItems;
    }
    public void display(){
        System.out.println("Printing Queue");
        if(this.isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        if(this.head==this.tail){
            System.out.println(this.queData[this.head]);
            return;
        }
        for(int i = 0 ; i<this.nItems ;i++){
            System.out.print(this.queData[(this.head+i)%this.maxSize]+ " ");
        }
        System.out.println();
    }
}

class TestQueue{
    public static void main(String[] args){
        Queue q = new Queue(5);
        q.display();
        q.enQueue(4);
        q.display();
        q.enQueue(3);
        q.display();
        q.enQueue(10);
        q.display();
        q.enQueue(34);
        q.display();
        q.enQueue(2);
        q.display();
        q.enQueue(12);
        q.display();
        q.deQueue();
        q.display();
        q.deQueue();
        q.display();
        q.deQueue();
        q.display();
        q.deQueue();
        q.display();
        q.deQueue();
        q.display();
        q.deQueue();
        q.display();
    }
}
 */

/*
        int temp = number;
        int x;
        int count = 0;
        while (temp != 0) {
            temp = temp / 2;
            count++;
        }
        temp = number;
        Stack s = new Stack(count);
        while (temp != 0) {
            x = temp % 2;
            temp = temp / 2;
            s.push(x);
        }
//        s.display();

        while (!s.isEmpty()) {
            try {
                System.out.print(s.pop() + " ");
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
//        s.display();
 */