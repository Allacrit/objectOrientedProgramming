package lesson5.task1;

public class Main {
    public static void main(String[] args) {
        PresenterCalculator presenterCalculator = new PresenterCalculator(new ViewCalculator(), new ModelCalculator());
        presenterCalculator.calculationPerform();

    }
}
