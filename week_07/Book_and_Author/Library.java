package week_07.Book_and_Author;

public class Library {
    Book[] books = new Book[100];
    static int countBooks = 0;

    void AddBook(Book book) {
        books[countBooks++] = book;
    }

    void DisplayBooks() {
        for (int i = 0; i < countBooks; i++) {
            System.out.println(books[i].getInfo());
        }
    }
}