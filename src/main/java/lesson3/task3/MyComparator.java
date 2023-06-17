package lesson3.task3;

import java.util.Comparator;

public class MyComparator<T> implements Comparator<T> {
    private final Comparator<T> comparator;

    public MyComparator(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    /**
     * Сравнивает два обьекта с учётом переданного компаратора
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return результат
     */
    @Override
    public int compare(T o1, T o2) {
        return comparator.compare(o1, o2);
    }
}
