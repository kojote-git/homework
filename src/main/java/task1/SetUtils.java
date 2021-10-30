package task1;

import java.util.HashSet;
import java.util.Set;

public abstract class SetUtils {

    private SetUtils() {
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<>();
        unionSet = set1;
        for (T t : set2) {
            if (!unionSet.contains(t)) {
                unionSet.add(t);
            }
        }
        return unionSet;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> intersectSet = new HashSet<>();
        for (T t : set1) {
            if (set2.contains(t)) {
                intersectSet.add(t);
            }
        }
        return intersectSet;
    }
}
