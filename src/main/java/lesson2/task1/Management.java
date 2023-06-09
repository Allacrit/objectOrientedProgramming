package lesson2.task1;

public interface Management {
    /**
     * Добавление записи
     */
    void add(Book book);

    /**
     * Удаление Книги
     *
     * @param book Экземпляр книги
     */
    public void removeBook(Book book);

    /**
     * Удаление записи по индексу
     *
     * @param index индекс записи
     */
    void remove(int index);
}
