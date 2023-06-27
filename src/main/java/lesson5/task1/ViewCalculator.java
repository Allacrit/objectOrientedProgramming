package lesson5.task1;

import java.util.Scanner;

public class ViewCalculator {
    private final Scanner scanner;

    public ViewCalculator() {
        this.scanner = new Scanner(System.in);
    }

    public Number getNumber() {
        System.out.print("Введите число: ");
        String value = scanner.next();
        return Double.parseDouble(value);
    }

    public char getOperation() {
        System.out.print("Введите оператор (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public void printResult(Number result) {
        System.out.printf("Результат: %s%n", result.toString());
    }
}
