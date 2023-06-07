public class Main {
    public static void main(String[] args) {
        int[] array = {63, 25, 12, 22, 11};
        Main m = new Main();
        System.out.print("Unsorted array: ");
        m.printArray(array);
//        m.insertionSort(array);
//        m.selectionSort(array);
        m.bubbleSort(array);
        System.out.print("\nSorted array: ");
        m.printArray(array);
    }

    public void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
    }

    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
    }

    public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}

//for (int i = 1; i < array.length; i++) {
//        int temp = array[i];
//        int j = i - 1;
//
//        while (j >= 0 && array[j] > temp) {
//        array[j + 1] = array[j];
//        j = j - 1;
//        }
//        array[j + 1] = temp;
//        }

/*
for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min_index] > array[j]) {
                    min_index = j;
                }
            }
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
 */

/*
for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;

                }
            }
        }
 */