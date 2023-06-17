package lesson4.task3;

public class MaxValue<T extends Comparable<T>> {
    public T getMax(T valueA, T valueB) {
        return valueA.compareTo(valueB) >= 0? valueA : valueB;
    }
}
