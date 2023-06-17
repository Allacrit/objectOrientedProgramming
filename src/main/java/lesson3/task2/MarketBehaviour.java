package lesson3.task2;

/**
 * добавляют и удаляют людей из очереди, а также метод update, который обновляет состояние магазина
 * путем принятия и отдачи заказов.
 */
public interface MarketBehaviour extends QueueBehaviour {
void addPerson(String person);
String removePerson();
void update();
}
