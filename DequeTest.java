import java.util.Iterator;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class DequeTest
{
    public static void main(String[] args)
    {
      Deque<String> deque = new ArrayDeque<String>();

      // We can add elements to the queue in various ways
      deque.add("E1");
      deque.addFirst("E2");
      deque.addLast("E3");
      deque.push("E4");
      deque.offer("E5");
      deque.offerFirst("E6");
      deque.offerLast("E7");

      deque.pop();
      deque.removeLast();
      deque.removeFirst();


      for( String s : deque ){
        System.out.println(s);
      }


}
}
