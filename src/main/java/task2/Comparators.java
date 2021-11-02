package task2;

import java.util.Comparator;

public abstract class Comparators {

    private Comparators() {
    }

    public static Comparator<Student> byName() {
        Comparator<Student> res = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        };
        return res;
    }

    public static Comparator<Student> byCourse() {
        Comparator<Student> res  = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getCourse().compareTo(s2.getCourse());
            }
        };
        return res;
    }
}
