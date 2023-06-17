package lesson4.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DataContainer <T>{
    private List<T> elements;
    public DataContainer() {
        elements = new ArrayList<>();
    }
    public void add(T element) {
        elements.add(element);
    }
    public T get(int index) {
        return elements.get(index);
    }
    public void sort(Comparator<? super T> comparator) {
        elements.sort(comparator);
    }
    public void print() {
        for (T element : elements) {
            System.out.println(element);
        }
    }
}
