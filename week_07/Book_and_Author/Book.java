package week_07.Book_and_Author;

public class Book {
    String name;
    Author author;
    double price;
    int qty;

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    String getName(){
        return name;
    }

    Author getAuthor(){
        return author;
    }

    double getPrice(){
        return price;
    }

    void setPrice(double price){
        this.price = price;
    }

    int getQty(){
        return qty;
    }

    void setQty(int qty){
        this.qty = qty;
    }

    String getInfo(){
        return "Book[name=" + name + ", Author[name=" + author.name + ",email=" + author.email + ",gender="  + author.gender + "],price=" + price + ",qty=" + qty + "]";
    }
}