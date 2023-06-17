package lesson4.task3;

public class Main {
    public static void main(String[] args) {
        MaxValue<Integer> maxValue = new MaxValue<>();
        System.out.println(maxValue.getMax(100,23));

        MaxValue<Double>maxValue1 = new MaxValue<>();
        System.out.println(maxValue1.getMax(17.5,99.9));

        MaxValue<String>maxValue2 = new MaxValue<>();
        System.out.println(maxValue2.getMax("Кирилл","Мифодий"));
    }
}
