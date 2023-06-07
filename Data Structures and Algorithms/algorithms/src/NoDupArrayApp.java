public class NoDupArrayApp {
    public static void main(String[] args) {
        NoDupArray a = new NoDupArray(10);
        a.insert(4);
        a.insert(3);
        a.insert(5);
        a.insert(2);
        a.insert(1);
        a.delete(0);
        a.display();
    }


}

class NoDupArray {
    private long[] a;//ref to array a
    private int nEliments;//number of data items

    public NoDupArray(int max) {//constructor
        this.a = new long[max];
        this.nEliments = 0;
    }

    public boolean find(long searchKey) {//find specified value
        if (this.nEliments == 0) {
//            System.out.println("Array is empty");
        } else {
            for (int i = 0; i < this.nEliments; i++) {
                if (a[i] == searchKey) {
                    return true;
                }
            }
        }
        return false;
    }

    public void insert(long value) {//put element into array
        boolean status = find(value);
        if (status) {
            System.out.println("Value exists");
            return;
        }
        this.a[this.nEliments] = value;
        this.nEliments++;
        return;

    }

    public boolean delete(long value) {//delete the element if it found
        for (int i = 0; i < this.nEliments; i++) {
            if (a[i] == value) {
                for (int j = i + 1; j < this.nEliments; j++) {
                    a[j - 1] = a[j];
                }
                this.nEliments--;
                return true;
            }
        }
        System.out.println("Value not found" +
                "");
        return false;
    }

    public void display() {//display array contents
        for (int i = 0; i < this.nEliments; i++) {
            System.out.print(this.a[i] + " ");
        }
        System.out.println();
    }
}
