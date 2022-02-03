package HW2;

public class MergeSort {
    // private MergeSort;

    static void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
        // making two new temp arrays
        int R[] = new int[n2];
        int L[] = new int[n1];

        // Copying data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // Grab the remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

        // Grab the remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

    }
    //print method... just how it sounds. 
    static void print(int[] a, int low, int high) {
        System.out.print("[ ");
        for (int i = low; i <= high; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]");
    }

    static int select(int[] a, int i) {
        //smallestIndex equals the parameter i
        int smallestIndex = i;
        //looping through the list and finding smallest index 
        for (int j = i + 1; j < a.length; ++j) {
            if (a[j] < a[smallestIndex])
                smallestIndex = j;
        }
        return smallestIndex;
    }


    // Its a main function that sorts arr[l..r] using the inbuilt function merge()
    static void sort(int[] a) {
        int i, smallestIndex, temp;
        //loops through the entire data set and sorts the data set 
        for (i = 0; i < a.length; ++i) {
            smallestIndex = select(a, i);
            //simple trick to clone 
            temp = a[i];
            a[i] = a[smallestIndex];
            a[smallestIndex] = temp;

            // output
            print(a, 0, i);
            print(a, i + 1, a.length - 1);
            System.out.println();
        }

    }

}
