package lesson3.task2;

/**
 * Имитируют работу очереди
 */
public interface QueueBehaviour {
    int size();
    String dequeue();
    boolean isEmpty();
    void enqueue(String person);
    String info();
}