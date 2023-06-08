package lesson1.task1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Пушок", 4);
        Owner owner = new Owner("Иван");
        cat.setOwner(owner);
        cat.greet();

        Cat cat1 = new Cat("Лёва", 7);
        cat1.greet();
        Owner owner1 = new Owner("Кирилл");
        cat1.setOwner(owner1);
        cat1.greet();
    }
}