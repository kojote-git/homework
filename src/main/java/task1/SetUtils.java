package task1;

import java.util.*;


public abstract class SetUtils {

    private SetUtils() {
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> res = new HashSet<>(set1);
        res.addAll(set2);
        return res;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {

        Set<T> res = new HashSet<>(set1);
        res.retainAll(set2);
        return res;
    }

}
