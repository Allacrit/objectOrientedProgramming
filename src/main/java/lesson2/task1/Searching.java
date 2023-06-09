package lesson2.task1;

public interface Searching {
    /**
     * Поиск по автору
     *
     * @param author имя автора
     */
    public void searchByAuthor(String author);

    /**
     * Поиск по названию
     *
     * @param title название
     */
    void searchByTitle(String title);
}
