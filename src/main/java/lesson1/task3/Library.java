package lesson1.task3;

import java.util.ArrayList;

class Library {
    private ArrayList<Book> catalog;

    public Library() {
        catalog = new ArrayList<>();
    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void removeBook(Book book) {
        catalog.remove(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Доступные книги:");
        for (Book book : catalog) {
            if (book.isAvailable()) {
                book.displayInfo();
                System.out.println();
            }
        }
    }

    public void searchByAuthor(String author) {
        System.out.printf("Книги автора: %s%n", author);
        for (Book book : catalog) {
            if (book.getAuthor().toLowerCase().equals(author.toLowerCase())) {
                book.displayInfo();
                System.out.println();
            }
        }
    }

    public void searchByTitle(String title) {
        System.out.printf("Поиск по имени: %s%n", title);
        for (Book book : catalog) {
            if (book.getTitle().toLowerCase().equals(title.toLowerCase())) {
                book.displayInfo();
                System.out.println();
            }
        }
    }
}
