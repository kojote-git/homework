package task1;

import java.util.HashSet;
import java.util.Set;

public abstract class SetUtils {

    private SetUtils() {
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> rez = new HashSet<>(set1);
        rez.addAll(set2);
        return rez;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> rez = new HashSet<>(set1);
        rez.retainAll(set2);
        return rez;
    }
}
