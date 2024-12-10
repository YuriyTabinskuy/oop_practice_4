import java.util.List;

public class BookService {
    private final List<String> books;

    public BookService(List<String> books) {
        this.books = books;
    }

    public String findBook(String bookName) throws BookNotFoundException {
        if (!books.contains(bookName)) {
            throw new BookNotFoundException("Книга '" + bookName + "' не знайдена в бібліотеці!");
        }
        return "Книга '" + bookName + "' доступна для читання.";
    }
}