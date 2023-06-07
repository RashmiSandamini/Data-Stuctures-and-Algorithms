public class OrderedArrays {

    public static void main(String[] args) {
        OrdArray ord = new OrdArray(10);
        ord.insert(3);
        ord.insert(5);
        ord.insert(6);
        ord.insert(11);
        ord.insert(13);
        ord.insert(14);
        ord.insert(8);
        ord.insert(21);
        ord.insert(13);
        ord.insert(15);
        ord.display();
//        int index=ord.find(0);
//        System.out.println(index);
        ord.delete(6);
        ord.display();
    }
}

class OrdArray {
    private long[] a; // ref to array a
    private int nElements; //number of data items

    public OrdArray(int max) {      //constructor
        this.a = new long[max];
//        this.nElements = 0;
    }

    public int size() { // return max size of the array
        return this.a.length;
    }

    public int find(long searchKey) {
        for (int i = 0; i < nElements; i++) {
            if (a[i] == searchKey) {
                return i;
            }
        }
        return -1;
    }

    public void insert(long value) { // put element into arrray
        if (this.a.length == this.nElements) {
            System.out.println("Array is full. Cannot insert anymore");
            return;
        }
        for (int i = 0; i < nElements; i++) {
            if (value < this.a[i]) {
                for (int j = nElements; j > i; j--) {
                    this.a[j] = this.a[j - 1];
                }
                this.a[i] = value;
                this.nElements++;
                return;
            }
        }
        this.a[this.nElements] = value;
        this.nElements++;
    }

    public boolean delete(long value) {
        if (this.nElements == 0) {
            System.out.println("Array is empty");
            return false;
        }
        boolean status = false;
        for (int i = 0; i < this.nElements; i++) {
            if (a[i] == value) {
                for (int j = i; j < this.nElements - 1; j++) {
                    a[j] = a[j + 1];
                }
                this.nElements--;
//                i--;
                status = true;
            }
        }
        return status;
    }

    void display() { // display array contents
        if (this.nElements==0){
            System.out.println("Array is empty");
            return;
        }
        for (int i = 0; i < this.nElements; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}