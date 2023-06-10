package lesson2.task2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        market.addPerson("Кирилл");
        market.addPerson("Сергей");
        market.addPerson("Валера");
        market.addPerson("Настя");

        market.update();
        market.size();

        market.update();
        market.size();

        market.update();
        market.size();

        market.update();
        market.size();

        market.update();
        market.size();

        market.update();
        market.size();

        market.addPerson("Ира");

        market.update();
        market.size();

    }
}
