package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparableBasics {
    static void main() {
        List<Student> students = new ArrayList<>();

        students.add(new Student(13,"sherya",49));
        students.add(new Student(14,"pranjal",61));
        students.add(new Student(14,"radha",42));
        students.add(new Student(15,"raju",52));
        students.add(new Student(12,"soni",55));

        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);
    }
}
