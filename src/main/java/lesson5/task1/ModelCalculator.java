package lesson5.task1;

public class ModelCalculator {
    private Number result;

    public ModelCalculator() {
        this.result = 0;
    }

    public void addition(Number numberFirst, Number numberSecond) {
        result = numberFirst.doubleValue() + numberSecond.doubleValue();
    }

    public void subtraction(Number numberFirst, Number numberSecond) {
        result = numberFirst.doubleValue() - numberSecond.doubleValue();
    }

    public void multiplication(Number numberFirst, Number numberSecond) {
        result = numberFirst.doubleValue() * numberSecond.doubleValue();
    }

    public void division(Number numberFirst, Number numberSecond) {
        if (numberSecond.doubleValue() != 0) {
            result = numberFirst.doubleValue() / numberSecond.doubleValue();
        } else {
            throw new IllegalArgumentException("Нельзя делить на нуль!!");
        }
    }

    public Number getResult() {
        return result;
    }
}
