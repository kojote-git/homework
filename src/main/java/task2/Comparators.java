package task2;

import java.util.Comparator;

public abstract class Comparators {

    private Comparators() {
    }

    public static Comparator<Student> byName() {
        Comparator<Student> res = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        return res;
    }

    public static Comparator<Student> byCourse() {
        Comparator<Student> res  = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getCourse().compareTo(o2.getCourse());
            }
        };
        return res;
    }
}
