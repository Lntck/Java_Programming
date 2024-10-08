package week_07.Book_and_Author;

public class Main_1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        Author author = new Author("Dostoevskii", "email", 'M');
        Book book = new Book("name", author, 100, 5);
        library.AddBook(book);
        library.DisplayBooks();
    }
}