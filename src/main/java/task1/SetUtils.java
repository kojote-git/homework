package task1;

import java.util.HashSet;
import java.util.Set;

public abstract class SetUtils {

    private SetUtils() {
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> union = set1;
        union.addAll(set2);
        return union;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> intersection = set1;
        intersection.retainAll(set2);
        return intersection;
    }

}
