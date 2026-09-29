import java.util.Scanner;
public class Book {
    String title;
    String author;
    String isbn;
    boolean isBorrowed;
    static int totalBooks;
    static
    {
        totalBooks = 0;
    }
    {
        totalBooks++;
    }

    Book(String isbn, String title, String author)
    {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn)
    {
        this("isbn", "unknown", "unknown");
    }

    static int getTotalBooks()
    {
        return totalBooks;
    }
    void borrowBook()
    {
        if(isBorrowed)
        {
            System.out.println("Book is already borrowed");
        }
        else
        {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }

    void returnBook()
    {
        if(isBorrowed)
        {
            this.isBorrowed = false;
            System.out.println("Hope you injoyed, please leave a review.");
        }
        else
        {
            System.out.println("This Book is already in the library.");
        }
    }
    public static void main(String[] args) {
        Book designOfThinking = new Book("1","Design", "xyz");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalBooks());
        designOfThinking.borrowBook();
        myBook.borrowBook();
        designOfThinking.borrowBook();
        designOfThinking.returnBook();
        designOfThinking.borrowBook();

    }
}