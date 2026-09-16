package Collection;
import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics{
    static void main() {
        Queue<Integer> queue = new LinkedList<>();

        //add
        queue.add(45);
        queue.add(12);
        queue.add(15);
        queue.add(75);
        queue.add(65);
        queue.add(32);
        System.out.println(queue);

        //offer : equivalent to add
        queue.offer(12);
        System.out.println(queue);

        //element: similar to peek and returns first element.
        System.out.println(queue.element());

        //poll : removes the last input or the first element entered : in our case => 45
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}