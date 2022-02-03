package HW2;
// This is to test your four sorting classes. 
// The array used here is just a sample. 
// Your sorting methods need to pass the test of any integer arrays. 

public class Main {
    public static void main(String[] args) {
        
        int [] nums = new int[]{4, 3, 6, 9, 2, 5, 1, 8, 7};
        System.out.println("\nSelection Sort: ");
        SelectionSort.sort(nums);

        nums = new int[]{4, 3, 6, 9, 2, 5, 1, 8, 7};
        System.out.println("\nMerge Sort: ");
        MergeSort.sort(nums);


        nums = new int[]{4, 3, 6, 9, 2, 5, 1, 8, 7};
        System.out.println("\nQuick Sort: ");
        QuickSort.sort(nums, 0, nums.length - 1);
        print(nums);

    }

    static void print(int arr[])
    {
        int n = arr.length;
        System.out.print("[ ");
        for (int i=0; i<n; ++i){
            System.out.println(arr[i] + " ");
        }
        System.out.println("]");
    }
}