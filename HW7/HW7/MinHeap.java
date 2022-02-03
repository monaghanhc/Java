/* @author Hunter Monaghan
Assignment 7
Min Heap ascending order 
nov 7th, 2021
*/

package HW7;
import java.util.*;

public class MinHeap {
    // declaring heapsize and an arr[]
    private int heapSize;
    private int arr[];

    // constuctor
    MinHeap() {
        heapSize = 0;
        arr = new int[2];
    }
    private void resizeArray() {
        int newLength = arr.length * 2;
        int[] newArray = new int[newLength];
        if (newArray != null) {
           // Copy from existing array to new array
           for (int i = 0; i < arr.length; i++) {
              newArray[i] = arr[i];
           }
  
           // Set the reference to the new array
           arr = newArray;
        }
     }

    // To insert a node into the heap
    public void insert(int element) {

        //resize if needed
        if(heapSize == arr.length){
            resizeArray();
        }
        //adding a new value to the end
        System.out.printf("insert(%d):\n", element);
        arr[heapSize] = element;
        heapSize++;
        //heapifyUp from the last index to restore heap property 
        heapifyUp();

    }

    // To heapify the node at pos up
    private void heapifyUp() {
       
        //get the nodes index
        int index = (heapSize - 1);
        
        while (index > 0) {
            //condition statement determining 
            if (arr[(index - 1) / 2] > arr[index]) {
                System.out.printf("   percolateUp() swap: %d <-> %d\n", index, arr[index]);
                int temp = arr[index];
                arr[index] = arr[(index - 1) / 2];
                arr[(index - 1) / 2] = temp;
                index = (index - 1) / 2;
            } else {
                break;
            }
        }

    }

    // To heapify the node at pos down
    private void heapifyDown() {
        //fidning the min among the nodes
        int index = 0;
        int left = 2 * index + 1;
        while (left < heapSize) {
            //int min2 = value;
            int min = left;
            int right = ++left;
            if (right < heapSize) {
                if (arr[left] > arr[right]) {
                    min++;
                }
            }
            //check for a to make sure there are no violations of the max heap property 
            //conditional determining if index 0 is greater than the left 
            if (arr[index] > arr[min]) {
                //swap/clonee method
                int temp = arr[min];
                arr[min] = arr[index];
                arr[index] = temp;
            }
            //continue loop from the min node
            index = min;
            left = 2 * index + 1;
            //output
            System.out.printf("   percolateDown() swap: %d <-> %d\n", left, arr[index]);

            }
        }
     
    //simple print method
    public void print() {
        for (int i = 0; i < heapSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // To remove and return the minimum
    // element from the heap
    public int remove() {
        System.out.println("Remove(): ");
        int maxValue = arr[0];
        //move the last item in the array into index 0
        int replaceValue = arr[heapSize - 1];
       // int replaceValue = arr[0];
       heapSize--;
       if(heapSize > 0){
           arr[0] = replaceValue;
           //heapify down to restor max heap prop
           heapifyDown();
       }
        //return the max value
        return maxValue;

    }

    public String getHeapArrayString() {
        if (heapSize == 0) {
           return "[]";
        }
  
        String arrayString = String.format("[%d", arr[0]);
        for (int i = 1; i < heapSize; i++) {
           arrayString += (", " + arr[i]);
        }
        return arrayString + "]";
     }


    public int getHeapSize(){
        return heapSize;
    }

}





