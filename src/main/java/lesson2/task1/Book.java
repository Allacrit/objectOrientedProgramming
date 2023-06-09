package lesson2.task1;

public class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public void displayInfo() {
        System.out.printf("""
                Название: %s
                Автор: %s
                %s%n""", title, author, checkAvailable());
    }

    private String checkAvailable() {
        String resultAvailable;
        if (available) {
            resultAvailable = "Доступна";
        } else {
            resultAvailable = "Не доступна";
        }
        return resultAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}