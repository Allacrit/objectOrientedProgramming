package lesson4.task4;

public class Main {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>();
        container.add("Маша");
        container.add("Авоська");
        container.add("Кирилл");
        container.add("Удочка");
        container.add("Урок");
        container.add("Лампа");
        container.add("Кейс");
        container.add("Буклет");

        container.print();
        System.out.println();
        System.out.println(container.get(2));
        System.out.println();
        container.sort(String::compareTo);
        container.print();

        System.out.println();
        DataContainer<Integer>container1 = new DataContainer<>();
        container1.add(100);
        container1.add(44);
        container1.add(10);
        container1.add(56);
        container1.add(3);

        container1.print();
        System.out.println();
        container1.sort(Integer::compareTo);
        container1.print();
    }
}
