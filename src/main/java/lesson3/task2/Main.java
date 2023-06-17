package lesson3.task2;

public class Main {
    public static void main(String[] args) {
        QueueMarket queueMarket = new QueueMarket();
        queueMarket.enqueue("Валера");
        queueMarket.enqueue("Кутуня");
        queueMarket.enqueue("Иван");

        QueueMarket queueMarket1 = new QueueMarket();
        queueMarket1.enqueue("Mark");
        queueMarket1.enqueue("Pablo");
        queueMarket1.enqueue("Mike");
        queueMarket1.enqueue("Mike");

        int val = queueMarket.compareTo(String.valueOf(queueMarket1));
        if (val < 0) {
            System.out.println("Очередь 1 меньше 2");
        } else if (val > 0) {
            System.out.println("Очередь 2 меньше 1");
        } else {
            System.out.println("Очереди одинаковы");
        }
    }
}
