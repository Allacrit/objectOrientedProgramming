package lesson1.task1;

public class Cat {
    private String name;
    private int age;
    private Owner owner;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.printf("Меня зовут %s. Мне %d %s. %s%n", name, age, checkAge(), checkStringOwner());
    }

    private String checkAge() {
        String typeStringAge;
        if (age == 1) {
            typeStringAge = "год";
        } else if (age > 1 && age < 5) {
            typeStringAge = "года";
        } else {
            typeStringAge = "лет";
        }
        return typeStringAge;
    }
    private String checkStringOwner() {
        String ownerName;
        if (owner != null) {
            ownerName = String.format("Мой хозяин - %s.",owner.getName());
        } else {
            ownerName = "У меня нет хозяина.";
        }
        return ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}