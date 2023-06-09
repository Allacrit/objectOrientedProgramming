package lesson2.task1;

import java.util.ArrayList;
import java.util.Scanner;

class Library implements Information, Management, Reading, Searching, Use {
    private ArrayList<Book> catalog;

    public Library() {
        catalog = new ArrayList<>();
    }

    @Override
    public void add(Book book) {
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

    @Override
    public void searchByAuthor(String author) {
        boolean found = false;
        System.out.printf("Книги автора: %s%n", author);
        for (Book book : catalog) {
            if (book.getAuthor().toLowerCase().equals(author.toLowerCase())) {
                book.displayInfo();
                System.out.println();
                found = true;
            }
            if (!found) {
                System.out.printf("Книги автора %s не найдены.%n", author);
            }
        }
    }

    @Override
    public void searchByTitle(String title) {
        boolean found = false;
        System.out.printf("Поиск по имени: %s%n", title);
        for (Book book : catalog) {
            if (book.getTitle().toLowerCase().equals(title.toLowerCase())) {
                book.displayInfo();
                System.out.println();
                found = true;
            }
            if (!found) {
                System.out.printf("Книга %s не найдена.%n", title);
            }
        }
    }

    @Override
    public void info() {
        System.out.println("Список книг: ");
        for (Book book : catalog) {
            book.displayInfo();
            System.out.println();
        }
    }

    @Override
    public void remove(int index) {
        if (index >= 0 && index < catalog.size()) {
            Book removeBook = catalog.remove(index);
            System.out.printf("Книга %s удалена.%n", removeBook.getTitle());
        } else {
            System.out.println("НЕКОРРЕКТНЫЙ НОМЕР!!!!");
        }
    }

    @Override
    public void read() {
        System.out.print("Введите номер книги которую будете читать: ");
        Scanner scanner = new Scanner(System.in);
        int bookNumber = scanner.nextInt();

        if (bookNumber >= 0 && bookNumber < catalog.size()) {
            Book bookToRead = catalog.get(bookNumber);
            System.out.printf("Вы читаете книгу: %s.%n", bookToRead.getTitle());
        } else {
            System.out.println("НЕКОРРЕКТНЫЙ НОМЕР!!!!");
        }
    }

    @Override
    public void use() {
        System.out.println("Выдача книги....");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер книги: ");
        int bookNumber = scanner.nextInt();

        if (bookNumber >= 0 && bookNumber < catalog.size()) {
            Book bookToUse = catalog.get(bookNumber);
            if (bookToUse.isAvailable()) {
                bookToUse.setAvailable(false);
                System.out.printf("Книга %s выдана.%n", bookToUse.getTitle());
            } else {
                System.out.println("Книга не доступна");
            }
        } else {
            System.out.println("НЕКОРРЕКТНЫЙ НОМЕР!!!!");
        }
    }

    @Override
    public void refund() {
        System.out.println("Возврат книги...");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер книги: ");
        int bookNumber = scanner.nextInt();

        if (bookNumber >= 0 && bookNumber < catalog.size()) {
            Book bookToReturn = catalog.get(bookNumber);
            if (!bookToReturn.isAvailable()) {
                bookToReturn.setAvailable(true);
                System.out.printf("Книга %s возвращена.%n", bookToReturn.getTitle());
            } else {
                System.out.printf("Книга %s доступна.%n", bookToReturn.getTitle());
            }
        } else {
            System.out.println("НЕКОРРЕКТНЫЙ НОМЕР!!!!");
        }
    }
}
