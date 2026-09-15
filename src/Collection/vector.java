package Collection;

import java.util.*;

public class vector {
    static void main() {
        Vector<String> arr = new Vector<>();

        //add
        arr.add("hello");
        arr.add("world");
        arr.add("here");
        System.out.println(arr);
        arr.add("I'm");// This not getting inserted.
        //remove
        arr.remove(2);
        System.out.println(arr);

        //Or

        Vector<Integer> list = new Vector<>();
        list.add(14);
        list.add(26);
        System.out.println(list);
        //Or

        Collection<Integer> collection = new Vector<>();
        collection.add(45);
        collection.add(15);
        collection.add(23);
        collection.add(78);
        System.out.println(collection);

        //addAll
        list.addAll(collection);
        System.out.println(list);

        //removeAll
        list.removeAll(collection);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //clear
        list.clear();
        System.out.println(list);
        list.add(60);
        list.add(15);
        list.add(16);
        list.add(25);
        list.add(85);


        //iterator
        Iterator<String> iterator = arr.iterator();
        while(iterator.hasNext()){
            System.out.println("Element : "+ iterator.next());
        }

        //get
        System.out.println(arr.get(1));
        arr.set(1 ,"revolutionize");
        System.out.println(arr);
        arr.add("Pranjal");
        arr.add("King oF UnderWorld.");

        //toArray
        Object[] newArr = arr.toArray();
        for(Object obj: newArr){
            System.out.println(obj);
        }

        //contains
        System.out.println(arr.contains("Pranjal"));

        //sort
        Collections.sort(list);
        System.out.println(list);

        //clone
        Vector<String> anotherArr =  (Vector<String>)arr.clone();
        //arr.clone();
        System.out.println("Old List: " + arr);
        System.out.println("Cloned List: " + anotherArr);

        //ensureCapacity
        Stack<String> arrayList = new Stack<>();
        arr.ensureCapacity(20);

        //isEmpty
        System.out.println(arr.isEmpty());

        //indexOf
        System.out.println(arr.indexOf("Pranjal"));

        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st);

        st.push(11);
        System.out.println(st);

        st.push(12);
        System.out.println(st);

        st.pop();
        System.out.println(st);

        System.out.println(st.peek());

        System.out.println(st.search(12));

        System.out.println(st.empty());
    }
}
