import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Adding values into the shashMap
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        //Enhanced looping through nums
        for(int i : nums){
            hashMap.put(i , hashMap.getOrDefault(i, 0) + 1);
        }
        //adding more values and the freq queue using Map.Entry of HashMap
        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((a,b)-> b.getValue()- a.getValue());
        //adding freq to queues 
        queue.addAll(hashMap.entrySet());
        //new object made from int[k] called result
        int[] result = new int[k];
        var index = 0;
		// A do-while loop that finds the max frequent number 
       do{
            Map.Entry e = queue.remove();
            int num = (int)e.getKey();
            result[index] = num;
            index += 1;
        } while(index < k);
        //return the result
        return result;
    }
}
//worst case would be O(logn) 