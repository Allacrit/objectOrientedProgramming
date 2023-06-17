package lesson3.task1;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        market.addPerson("Кирилл");
        market.addPerson("Сергей");
        market.addPerson("Валера");
        market.addPerson("Настя");

       PersonProcess personProcess = person -> System.out.printf("Обработка: %s%n",person);
        market.processAllPerson(personProcess);
    }
}
