package task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class SetUtils {

    private SetUtils() {
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = set1;
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = set1;
        result.retainAll(set2);
        return result;
    }

}
