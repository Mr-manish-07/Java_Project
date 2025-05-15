package practice.java.oops;

public class book {
    private  int price;
    private String author;
    private String title;
    public book(int price, String author, String title) {
        this.price = price;
        this.author = author;
        this.title = title;
    }
    public void display() {
        System.out.println("Price: " + price + " Author: " + author + " Title: " + title) ;
    }

    public static void main(String[] args) {
        book b1 = new book(2000, "John", "Jane");
        b1.display();
    }
}
