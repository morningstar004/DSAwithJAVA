package Collection;

public class Student implements Comparable<Student>{

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public int age;
    public String name;
    public int weight;

    public Student(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student that) {
        // this method is called for current object
        //sorting logic :: age
        if(this.age == that.age){
            return this.name.compareTo(that.name);
        }
        return  this.age - that.age; //ascending age
        // return that.age - this.age // descending age
    }
}
