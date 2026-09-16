package Collection;

import java.util.HashSet;
import java.util.Set;

public class setBasics {
    static void main() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        System.out.println(set1);
        System.out.println(set2);

        //retainAll : Gives intersection
        set1.retainAll(set2);
        System.out.println(set1);

        System.out.println(set2.containsAll(set1));
    }
}
