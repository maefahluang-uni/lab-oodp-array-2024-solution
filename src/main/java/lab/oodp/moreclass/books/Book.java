package lab.oodp.moreclass.books;

public class Book {
    private String title;
    private int year;
    private int pages;
    private String author;

    public Book(String title, int year, int pages, String author) {
        this.title = title;
        this.year = year;
        this.pages = pages;
        this.author = author;
    }

    public boolean isMoreRecentThan(Book other) {
        return this.year > other.year;
    }

    public boolean isLongerThan(Book other) {
        return this.pages > other.pages;
    }

    @Override
    public String toString() {
        return title + " (" + year + "), " + pages + " pages, Author: " + author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

}
