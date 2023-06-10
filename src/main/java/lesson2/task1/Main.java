package lesson2.task1;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();

       Book book = new Book("Война и мир","Лев Толстой");
        library.add(book);

        Book book1 = new Book("Анна Каренина", "Лев Толстой");
        library.add(book1);

        Book book2 = new Book("Евгений Онегин", "Александр Пушкин");
        library.add(book2);

       Book book3 = new Book("Смерть поэта","Михаил Лермонтов");
        library.add(book3);

        library.displayAvailableBooks();
        library.searchByAuthor("лев толстой");
        library.searchByTitle("Смерть поэта");

        library.removeBook(book3);
        library.displayAvailableBooks();
        library.info();
        library.remove(0);
        library.read();
        library.use();
        library.refund();
        library.info();
    }
}
