package lab_13;

public class Book implements Comparable<Book> {

    private String bookName;
    private String isbn;

    private String authorName;
    private int year;

    public Book(String bookName, String isbn, String authorName, int year) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.authorName = authorName;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", isbn='" + isbn + '\'' +
                ", authorName='" + authorName + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Book that) {
        return this.year - that.year;
    }
}
