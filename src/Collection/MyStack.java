package Collection;
import java.util.*;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(20);
        stack.push(30);
        stack.push(12);
        stack.push(45);
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.empty());

        System.out.println(stack.peek());

        stack.add(47);

        stack.search(45);

        stack.addFirst(11);

        System.out.println(stack);
    }
}
