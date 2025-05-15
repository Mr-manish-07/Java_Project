package project.Lib.Mang.System;

public class Book {

    //------------------------Attributes Variable)-----------------------------

    private int book_id;
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    //------------------------Composition Instead of inheritance-----------------

    private Libraray libraray;
    private Member member;


/*--------------------------------------------------------------------------------------------------------------------*/


    //-------------------------Constructor---------------------------------------

    public Book() {};

    public Book(int book_id, String title, String author, int data) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.isbn = Libraray.generateISBN(data);
    }

    //-------------------------Instance Method---------------------------------

    public int getBookId() { return book_id;}

    public String getTitle() { return title;}

    public String getAuthor() { return author;}

    public String getIsbn() { return isbn;}

    public boolean isAvailable(int bookId) {
        Book b1 = libraray.searchBookById(bookId);
        return b1 != null;
    }


    @Override
    public String toString() {
        return "\n"+"Book{" +
                "book_id=" + book_id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
