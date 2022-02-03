package HW2;

public class QuickSort {


    //this function takes the last element as the pivot
    static int partition(int[] numbers, int startIndex, int endIndex) {
        int midpoint = startIndex + (endIndex - startIndex) / 2;
        int pivot = numbers[midpoint];
        int high = endIndex;
        int low = startIndex;

        boolean done = false;
        //checks each element and swaps it before the pivot if its value is smaller.
        while (!done) {
            while (numbers[low] < pivot) {
                low = low + 1;
            }
            while (pivot < numbers[high]) {
                high = high - 1;
            }
            if (low >= high) {
                done = true;
            } else {
                int temp = numbers[low];
                numbers[low] = numbers[high];
                numbers[high] = temp;
                low++;
                high--;
            }
        }

        // "high" is the last index in the left segment.
        return high;
    }

    //takes as parameters the array to be sorted, the start and the end index.
    public static void sort(int[] numbers, int startIndex, int endIndex) {
        //watch case....like a catch statement so no error if endIndex is <= startIndex
        if (endIndex <= startIndex) {
            return;
        }
        //We get the index of the sorted pivot 
        //use it to recursively call partition() method with the same parameters as the sort() method
        int high = partition(numbers, startIndex, endIndex);
        sort(numbers, startIndex, high);
        sort(numbers, high + 1, endIndex);
    }

    // static void print(int[] a, int low, int high) {
    //     System.out.print("[ ");
    //     for (int i = low; i <= high; ++i) {
    //         System.out.print(a[i] + " ");
    //     }
    //     System.out.print("]");
    // }

}
