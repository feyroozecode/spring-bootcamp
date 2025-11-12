public class Book {
    public String name;
    public String author;
    public String publisher;
    public String isbn;
    public Book(String name, String author, String publisher, String isbn) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return this.name + " " + this.author + " " + this.publisher + " " + this.isbn;
    }
}
