package task1;

import java.util.HashSet;
import java.util.Set;

public abstract class SetUtils {

    private SetUtils() {
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> set = new HashSet<T>();
        set.addAll(set1);
        set.addAll(set2);
        return set;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> set = new HashSet<T>();
        for(T setElement : set1){
            if(set2.contains(setElement))
                set.add(setElement);
        }
        return set;
    }
}
