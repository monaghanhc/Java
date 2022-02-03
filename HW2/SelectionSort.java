package HW2;
// This is a sample of SelectionSort.
// The QuickSort and MergeSort can be implemented in the same style.

public class SelectionSort {

    // a private constructor
    private SelectionSort(){};

    // a method to print a segment of the array
    static void print(int[] a, int low, int high) {
        System.out.print("[ ");
        for (int i = low; i <= high; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]");
    }

    // the method the select the smallest item, starting from index i, and return its index
    static int select(int[] a, int i){
        int smallestIndex = i;
        for(int j = i+1; j < a.length; ++j) {
            if (a[j] < a[smallestIndex])
                smallestIndex = j;
        }
        return smallestIndex;
    }

    // the sort method for user to call
    static void sort(int[] a) {
        int i, smallestIndex, temp;
        for(i = 0; i < a.length; ++i) {
            smallestIndex = select(a, i);

            //put the selected to position i
            temp = a[i];
            a[i] = a[smallestIndex];
            a[smallestIndex] = temp;

            //output intermediate result
            print(a, 0, i);
            print(a, i+1, a.length-1);
            System.out.println();
        }

    }

}