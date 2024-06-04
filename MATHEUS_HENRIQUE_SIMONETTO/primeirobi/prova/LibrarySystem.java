package MATHEUS_HENRIQUE_SIMONETTO.primeirobi.prova;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private List<Book> books;
    private List<Student> students;

    public LibrarySystem() {
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchByTitle(String title) {
        return books.stream()
                    .filter(book -> book.getTitle().equalsIgnoreCase(title) && book.isAvailable())
                    .findFirst()
                    .orElse(null);
    }

    public Book searchByAuthor(String author) {
        return books.stream()
                    .filter(book -> book.getAuthor().equalsIgnoreCase(author) && book.isAvailable())
                    .findFirst()
                    .orElse(null);
    }

    public void borrowBook(int bookId, int studentId) {
        books.stream()
             .filter(book -> book.getId() == bookId)
             .findFirst()
             .ifPresent(book -> book.setAvailable(false));
    }

    public void returnBook(int bookId) {
        books.stream()
             .filter(book -> book.getId() == bookId)
             .findFirst()
             .ifPresent(book -> book.setAvailable(true));
    }

    public double calculateFine(int daysLate) {
        return daysLate > 7 ? (daysLate - 7) * 3.50 : 0;
    }
}
