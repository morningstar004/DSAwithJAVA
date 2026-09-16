package Collection;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueueBasics {
    static void main() {
        Queue<Integer> num = new PriorityQueue <>();

        num.add(12);
        num.offer(2);
        num.offer(3);
        num.offer(4);
        num.offer(5);

        System.out.println(num);// arranges in priority of smaller to larger number.
        System.out.println(num.poll());
        System.out.println(num);
        System.out.println(num.poll());
    }
}
