package project.Lib.Mang.System;

import java.util.ArrayList;
import java.util.List;

public class Libraray {

    //------------------------Attributes ( Variable)-----------------------------

    private String lib_name = "Book Market Space Library";
    private static int book_id = 1000;
    private static int no_of_books = 200;
    protected List<Book> books = new ArrayList<>();
    protected List<Book> lendBooks = new ArrayList<>();

    public List<Member> members = new ArrayList<>();

    //------------------------Composition Instead of inheritance-----------------

    private Book book;
    private Member member;
    private Head_Of_Lib head;

    /*--------------------------------------------------------------------------------------------------------------------*/


    //-------------------------Instance Method-----------------------------------

    public void addBook(Book book) {
        books.add(book);
        no_of_books++;
        System.out.println("Book added: " + book);
    }

    public Member addMember(Member member) {
        members.add(member);
        return member;
    }

    public void defaultMember(Member member, int key) {
        if (key == 5256) {
            members.add(member);
        }
    }

    public Book lendBook(int book_id, int member_id) {
        if (searchBookById(book_id) != null && searchMemberById(member_id)) {
            no_of_books--;
            lendBooks.add(searchBookById(book_id));
            return searchBookById(book_id);
        }
        return null;
    }

    public Book searchBookById(int id) {
        for (Book book : books) {
            if (book.getBookId() == id) {
                return book;
            }
        }
        return null;
    }

    public Book searchBookInLend(int id) {
        for (Book book : lendBooks) {
            if (book.getBookId() == id) {
                return book;
            }
        }
        return null;
    }

    public boolean searchMemberById(int member_id) {
        for(int i = 0; i < members.size(); i++) {
            if(Member.memberIds.get(i) == member_id) {
                System.out.println(members.get(i));
                return true;
            }
        }
        return false;
    }

    /*public Member searchMember(int member_id) {
        if (member.member_login || head.login) {
            for (Member member : members) {
                if (member.getMember_id() == member_id) {
                    System.out.println("Member found");
                    return member;
                }
            }
        }
        System.out.println("Member not found");
        return null;
    }*/

    public void removeMember(int member_id) {
       for (int i = 0; i<Member.memberIds.size(); i++) {
           if (Member.memberIds.get(i) == member_id) {
               Member.memberIds.remove(i);
               System.out.println("Member removed , Enter 7 for check");
               return;
           }
       }
        System.out.println("Member not found");
    }

    public void displayAllBooks() {
        System.out.println(books.toString());
    }

    public void displayAllMember() {
        System.out.println(members.toString());
    }

    public Book returnBook(int memId  , int bookId){
        Book bookStored = searchBookInLend(bookId);
        if(searchMemberById(memId) && bookStored != null) {
            lendBooks.remove(bookStored);
            return bookStored;
        }
        return null;
    }

    @Override
    public String toString() {
        return "\nLibrary Details  : \n" +
                "Name of library is : " + lib_name +
                "\nThere are " + no_of_books + " books in the library." +
                "\nOnly Student having Valid Registration number can go for it after verification.\n";
    }

    //--------------------------ISBN Generator-----------------------------------

    protected static String generateISBN(int seed) {
        return String.format("978-3-%03d-%03d-%d", seed % 1000, seed * 7 % 1000, seed % 10);
    }


    //-------------------Constructor(Generating Books)---------------------------

    public Libraray() {
        for (int i = 1; i <= no_of_books; i++) {
            book_id += 3;

            String title;
            if (i > 0 && i < 10) {
                title = "Java Programming" + i;
            } else if (i >= 10 && i < 21) {
                title = "C++ Programming" + i;
            } else if (i >= 21 && i < 41) {
                title = "Python Code" + i;
            } else if (i >= 181 && i < 191) {
                title = "JavaScript Web Dev" + i;
            } else if (i >= 41 && i < 61) {
                title = "React Js FrontEnd Framework" + i;
            } else if (i >= 91 && i < 105) {
                title = "Java  Advance Programming" + i;
            } else if (i >= 61 && i < 91) {
                title = "Spring Boot Framework" + i;
            } else if (i >= 105 && i < 141) {
                title = "Amazon web service " + i;
            } else if (i >= 141 && i < 181) {
                title = "Cloud Computing" + i;
            } else {
                title = "Humanity , Moral Science";
            }

            String author = "Author" + (i % 100);
            String isbn = generateISBN(i);

            Book book = new Book(book_id, title, author, i);
            books.add(book);
        }
    }

}
