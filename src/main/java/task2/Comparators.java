package task2;

import java.util.Comparator;

public abstract class Comparators {

    private Comparators() {
    }

    public static Comparator<Student> byName() {
        return Comparator.comparing(Student::getName);
    }

    public static Comparator<Student> byCourse() {
        return Comparator.comparing(Student::getCourse);
    }
}
