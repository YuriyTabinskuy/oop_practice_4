import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        BookService bookService = new BookService(
                Arrays.asList("1984", "Гаррі Поттер", "Володар перснів", "Майстер і Маргарита")
        );

       
        try {
            System.out.println(bookService.findBook("1984"));
        } catch (BookNotFoundException e) {
            System.out.println("Помилка: " + e.getMessage());
        } finally {
            System.out.println("Пошук першої книги завершено.");
        }

        System.out.println();

        
        try {
            System.out.println(bookService.findBook("Аліса в країні чудес"));
        } catch (BookNotFoundException e) {
            System.out.println("Помилка: " + e.getMessage());
        } finally {
            System.out.println("Пошук другої книги завершено.");
        }

        try {
            System.out.println(bookService.findBook("Володар перснів"));
        } catch (BookNotFoundException e) {
            System.out.println("Помилка: " + e.getMessage());
        } finally {
            System.out.println("Пошук третьої книги завершено.");
        }
    }
}