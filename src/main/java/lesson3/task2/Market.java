package lesson3.task2;

import java.util.Objects;

public class Market implements MarketBehaviour {
    private final QueueMarket queueMarket;

    public Market() {
        queueMarket = new QueueMarket();
    }

    @Override
    public void enqueue(String person) {
        queueMarket.enqueue(person);
    }

    @Override
    public String info() {
        return queueMarket.info();
    }

    @Override
    public String dequeue() {
        return queueMarket.dequeue();
    }

    @Override
    public boolean isEmpty() {
        return queueMarket.isEmpty();
    }

    @Override
    public int size() {
        System.out.printf("В очереди %s человек(а)%n",queueMarket.size());
        return queueMarket.size();
    }

    @Override
    public void addPerson(String person) {
        System.out.printf("В очереди появился новый покупатель: %s%n",person);
        enqueue(person);
    }

    @Override
    public String removePerson() {
        return dequeue();
    }

    @Override
    public void update() {
        if (checkQueue()) {
            System.out.printf("Выдача заказа покупателю: %s%n",queueMarket.info());
            removePerson();
            if (!checkQueue()) {
                System.out.println("Следующий покупатель отсутствует!");
            } else {
                System.out.printf("Следующий: %s%n",info());
            }
        } else {
            System.out.println("Очередь пуста");
        }
    }

    private boolean checkQueue() {
        return !Objects.equals(queueMarket.info(), "Очередь пуста");
    }
    public void processAllPerson(PersonProcess personProcess) {
        while (!isEmpty()) {
            String person = removePerson();
            personProcess.processPerson(person);
        }
    }
}
