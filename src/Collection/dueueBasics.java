package Collection;
import java.util.ArrayDeque;
import java.util.Deque;

public class dueueBasics {
    static void main() {
        Deque<Integer> dq = new ArrayDeque<>();

        //add
        dq.add(85);
        dq.add(46);
        dq.add(87);
        dq.add(3);
        dq.add(25);
        System.out.println(dq);

        //offer
        dq.offer(2);
        System.out.println(dq);

        //add element first or last
        dq.addFirst(12);
        System.out.println(dq);
        dq.addLast(22);
        System.out.println(dq);

        //poll
        dq.poll(); //remove the frist element entered.
        System.out.println(dq);
        dq.pollFirst();// same as poll.
        System.out.println(dq);
        dq.pollLast();// remove the last element.
        System.out.println(dq);

        //get
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());

    }
}
