package task1;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public abstract class SetUtils {

    private SetUtils() {
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> res = set1;
        res.addAll(set2);
        return res;
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
