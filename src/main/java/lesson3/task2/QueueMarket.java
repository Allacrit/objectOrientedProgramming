package lesson3.task2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Очередь покупателей
 */
public class QueueMarket implements QueueBehaviour,Comparable<String> {
    private Queue<String> queue;

    public QueueMarket() {
        queue = new LinkedList<>();
    }

    /**
     * Размер очереди
     */
    @Override
    public int size() {
        return queue.size();
    }

    /**
     * Удаляет покупателя
     */
    @Override
    public String dequeue() {
        return queue.poll();
    }

    /**
     * Проверка пустой очереди
     */
    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    /**
     * Добавляет покупателя
     *
     * @param person покупатель
     */
    @Override
    public void enqueue(String person) {
        queue.add(person);
    }

    @Override
    public String info() {
        if (!isEmpty()) {
            return queue.element();
        }
        return "Очередь пуста";
    }

    @Override
    public int compareTo(String o) {
        int sizeQueue = size() - o.length();
        return Integer.compare(sizeQueue, 0);
    }
}
