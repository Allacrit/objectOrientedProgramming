package lesson1.task3;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book("Война и мир","Лев Толстой");
        library.addBook(book);

        Book book1 = new Book("Анна Каренина", "Лев Толстой");
        library.addBook(book1);

        Book book2 = new Book("Евгений Онегин", "Александр Пушкин");
        library.addBook(book2);

        Book book3 = new Book("Смерть поэта","Михаил Лермонтов");
        library.addBook(book3);

        library.displayAvailableBooks();
        library.searchByAuthor("лев толстой");
        library.searchByTitle("Смерть поэта");

        book1.setAvailable(false);
        library.displayAvailableBooks();

        library.removeBook(book3);
        library.displayAvailableBooks();

    }
}
