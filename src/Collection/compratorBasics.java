package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class compratorBasics {
    static void main() {
        List<Student> students = new ArrayList<>();

        students.add(new Student(13,"sherya",49));
        students.add(new Student(14,"pranjal",61));
        students.add(new Student(14,"radha",42));
        students.add(new Student(15,"raju",52));
        students.add(new Student(12,"soni",55));

//        System.out.println(students, new Comparator<Student>(){
//            @Override
//            public int compare(Student o1, Student o2){
//                return o1.age - o2.age;
//            }
//        });

//        Collections.sort(students,( 01,02) -> o1.weight-o2.weight );

//        Collections.sort(students);
        System.out.println(students);
    }
}
