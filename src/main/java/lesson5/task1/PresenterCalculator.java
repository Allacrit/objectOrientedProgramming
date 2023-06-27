package lesson5.task1;

public class PresenterCalculator {
    private final ViewCalculator viewCalculator;
    private final ModelCalculator modelCalculator;

    public PresenterCalculator(ViewCalculator viewCalculator, ModelCalculator modelCalculator) {
        this.modelCalculator = modelCalculator;
        this.viewCalculator = viewCalculator;
    }

    public void calculationPerform() {
        Number numberFirst = viewCalculator.getNumber();
        char operation = viewCalculator.getOperation();
        Number numberSecond = viewCalculator.getNumber();

        switch (operation) {
            case '+' -> modelCalculator.addition(numberFirst, numberSecond);
            case '-' -> modelCalculator.subtraction(numberFirst, numberSecond);
            case '*' -> modelCalculator.multiplication(numberFirst, numberSecond);
            case '/' -> modelCalculator.division(numberFirst, numberSecond);
        }
        viewCalculator.printResult(modelCalculator.getResult());
    }
}
