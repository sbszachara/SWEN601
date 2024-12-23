package testprep;

public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String t, String a, String i) {
        this.title = t;
        this.author = a;
        this.ISBN = i;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getISBN() {
        return this.ISBN;
    }

    @Override
    public boolean equals(Object b) {
        Book bb = (Book) b;
        Book cc = new Book (bb.getTitle(), bb.getAuthor(), bb.getISBN());
        return (this.getISBN() == cc.getISBN());
    }

    public static void main(String[] args) {
        Book test = new Book("a", "b", "c");
        Book test2 = new Book("a", "b", "c");
        Book test3 = new Book("a", "b", "d");
        System.out.println(test.equals(test2));
        System.out.println(test.equals(test3));
    }

    
}
