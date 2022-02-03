package HW7;
import java.io.*;
public class HeapSort {

    public static void main(String[] args) {
        int[] nums = {9, 25, 4, 8, 13, 1, 7, 0};
        MinHeap heap = new MinHeap();
        // MaxHeap heap = new MaxHeap();

        // insert numbers to heap
        for (int i = 0; i < nums.length; i++) {
            heap.insert(nums[i]);
        }

        //pop numbers from heap to sort
        for (int i = 0; i < nums.length; i++) {
            nums[i] = heap.remove();
        }

        // print the sorted array
        System.out.println("The sorted array is: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
    }
}