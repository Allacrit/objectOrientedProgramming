package lesson3.task3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyPackegeCorted {
    public static <T> void sort(List <T> objects, Comparator<T> comparator) {
        Collections.sort(objects,comparator);
    }
}
