package project.Lib.Mang.System;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {

        //-----------------------------------------------Creating Instance of library and book--------------------------

        Libraray libraray = new Libraray();
        Book book = new Book();
        Member member = new Member();

        //------------------------------------------------Generated Member----------------------------------------------

        int key = 5256;
        libraray.defaultMember((new Member("200002", "7620343478", "220001")), key);
        libraray.defaultMember((new Member("200003", "6720343478", "220002")), key);
        libraray.defaultMember((new Member("200004", "8920343478", "220003")), key);
        libraray.defaultMember((new Member("200005", "8720343478", "220004")), key);
        libraray.defaultMember((new Member("200006", "7720343478", "220005")), key);
        libraray.defaultMember((new Member("200007", "7520343478", "220006")), key);
        libraray.defaultMember((new Member("200008", "9820343478", "220007")), key);
        libraray.defaultMember((new Member("200009", "7780343478", "220008")), key);
        libraray.defaultMember((new Member("200010", "7650343478", "220009")), key);
        libraray.defaultMember((new Member("200011", "7620343478", "220010")), key);
        libraray.defaultMember((new Member("200021", "9920343478", "220011")), key);
        libraray.defaultMember((new Member("200031", "8020343478", "220012")), key);
        libraray.defaultMember((new Member("200041", "8920343478", "220013")), key);
        libraray.defaultMember((new Member("200051", "9220343478", "220014")), key);
        libraray.defaultMember((new Member("200061", "7004687878", "220015")), key);


        //-----------------------------------------------Calling Method of classes--------------------------------------
        System.out.println(libraray);
        Scanner sc = new Scanner(System.in);
        boolean condition = true;

        while (condition) {
            System.out.print("""
                    Selection as per your requirement:
                    1 > For Student login
                    2 > For Admin login
                    3 > For exit
                    """);
            switch (sc.nextInt()) {
                case 1 -> {
//                    System.out.print("Enter Registration Number : ");
//                    String regNum = sc.next();
//                    System.out.print("Enter Phone Number : ");
//                    String phoneNum = sc.next();
//                    System.out.print("Enter College Unique id : ");
//                    String collegeUniqueId = sc.next();
//                    Member m1 = new Member(regNum, phoneNum, collegeUniqueId);
                        Member m1 = new Member("234234","6767676767" , "234234");
                    if (m1.member_login) {
                        libraray.defaultMember((m1), key);
                        boolean memberCondition = true;
                        while (memberCondition) {
                            System.out.print(""" 
                                    
                                    Enter Desirable input :
                                    //---------------Book Control----------------
                                    1 > For display all books
                                    2 > For search book by Id
                                    3 > For lend book
                                    4 > For return book
                                    5 > Check Book Status
                                    6 > Check Book Assign to your id
                                   
                                    //---------------Member Access---------------
                                    7 > Get member id
                                    8 > Get member contact
                                    9 > Get Registration Number
                                    10 > Get Phone number
                                    11 > Get college Id
                                    
                                    //----------------Member Profile---------------
                                    12 > Change Mobile number
                                    
                                    //---------------Log Out---------------------
                                    0 > For Logout from Member Login
                                    """);
                                    switch (sc.nextInt()) {
                                        case 1 -> {
                                            libraray.displayAllBooks();
                                        }
                                        case 2 -> {
                                            System.out.println("Enter Book id");
                                            int bookId = sc.nextInt();
                                            if(libraray.searchBookById(bookId) != null) {
                                                System.out.println("Book Fetched from database..."+libraray.searchBookById(bookId));
                                            }else {
                                                System.out.println("Book not found");
                                            }
                                        }
                                        case 3 -> {
                                            System.out.println("Enter book id");
                                            int bookId = sc.nextInt();
                                            System.out.println("Enter Member id");
                                            int memberId = sc.nextInt();
                                            if(libraray.lendBook(bookId, memberId) != null) {
                                                //System.out.println("Book:"+libraray.lendBook(bookId, memberId));
                                                if (libraray.searchBookById(bookId) != null) {
                                                    System.out.println("Do you want to take this if yes enter 1 , else press any key");
                                                    if (sc.nextInt() == 1) {
                                                        System.out.println("Book Assigned to Member id : " + memberId);
                                                    }
                                                }else{
                                                    System.out.println("Book not found");
                                                }
                                            }else {
                                                System.out.println("Data Mismatched");
                                            }

                                        }
                                        case 4 -> {
                                            System.out.println("Enter Member id who want to return book");
                                            int memberId = sc.nextInt();
                                            System.out.println("Enter the book is which you want to return book");
                                            int bookId = sc.nextInt();
                                            if(libraray.returnBook( memberId,bookId) != null) {
                                                System.out.println("Book:"+libraray.returnBook(memberId,bookId)+" is returned by : " + memberId);
                                            }else {
                                                if(libraray.searchBookById(bookId)!=null){
                                                    System.out.println("Do You want to lend book , if yes press 1 else another key");
                                                    int input = sc.nextInt();
                                                    if(input == 1) {
                                                        System.out.println("Book :" + libraray.lendBook(bookId,memberId) + " is assigned to member id :" +memberId);
                                                    }
                                                }else{
                                                    System.out.println("Book not found");
                                                }
                                            }

                                        }
                                        case 5 -> {}
                                        case 6 -> {}
                                        case 7 -> {}
                                        case 8 -> {}
                                        case 9 -> {}
                                        case 10 -> {}
                                        case 11 -> {}
                                        case 12 -> {}
                                        case 0 -> {
                                            System.out.println("Logging out");
                                            memberCondition = false;
                                        }
                                        default -> {
                                            System.out.println("Credentials wrong, please try again");
                                        }
                                    }
                        }

                    } else {
                        System.out.println("Login Failed , try again");
                    }
                }

                case 2 -> {

                    System.out.print("Enter Admin Id Number : ");
                    int adminUserId = sc.nextInt();
                    System.out.print("Enter Admin Password : ");
                    String adminPassword = sc.next();
                    Head_Of_Lib head = new Head_Of_Lib(adminUserId, adminPassword);
                    if (head.getLogin()) {
                        System.out.println("\n----------------You have logged in to Admin Panel✅ ---------------------");
                        boolean adminCondition = true;

                        while (adminCondition) {

                                System.out.print(""" 
                                        
                                        Enter Desirable input :
                                        //---------------Book Control----------------
                                        1 > For add book
                                        2 > For display all books
                                        3 > For search book by Id
                                        4 > For Lend book
                                        
                                        //---------------Member Control---------------
                                        5 > For add New Member
                                        6 > For display all members
                                        7 > For display all members id
                                        8 > For search member Id
                                        9 > For removing any Member
                                        
                                        //----------------Admin Profile---------------
                                        10 > For Change password
                                        11 > For change user Id Number
                                        12 > For get Password
                                        13 > For get user Id
                                        
                                        //---------------Log Out---------------------
                                        0 > For Logout from Admin
                                        """);
                                switch (sc.nextInt()) {
                                    case 1 -> {
                                        System.out.println("Enter book Id ");
                                        int bookId = sc.nextInt();
                                        System.out.println("Enter Title");
                                        String title = sc.next();
                                        System.out.println("Enter Author");
                                        String author = sc.next();
                                        System.out.println("Enter Data to generate ISBN");
                                        int data = sc.nextInt();
                                        Book book1 = new Book(bookId, title, author, data);
                                        libraray.addBook(book1);
                                        System.out.println("You can check added Book by input 2");
                                    }
                                    case 2 -> {
                                        libraray.displayAllBooks();
                                    }
                                    case 3 -> {
                                        System.out.println("Enter Book id");
                                        int bookId = sc.nextInt();
                                        if(libraray.searchBookById(bookId) != null) {
                                            System.out.println("Book Fetched from database..."+libraray.searchBookById(bookId));
                                        }else {
                                            System.out.println("Book not found");
                                        }

                                    }
                                    case 4 -> {
                                        System.out.println("Enter the id for book which you want to lend use any student's id");
                                        int bookId = sc.nextInt();
                                        System.out.println("Enter Member id from which you want to take books");
                                        int memberId = sc.nextInt();
                                        libraray.lendBook(bookId, memberId);
                                        if (libraray.searchBookById(bookId) != null) {
                                            System.out.println("Do you want to take this if yes enter 1");
                                            if (sc.nextInt() == 1) {
                                                System.out.println("Book Assigned to Member id : " + memberId);
                                            }
                                        }
                                    }
                                    case 5 -> {
                                        System.out.print("Enter Registration Number : ");
                                        String regNum = sc.next();
                                        System.out.print("Enter Phone Number : ");
                                        String phoneNum = sc.next();
                                        System.out.print("Enter College Unique Id : ");
                                        String collegeUniqueId = sc.next();
                                        Member m1 = new Member(regNum, phoneNum, collegeUniqueId);
                                        libraray.defaultMember((m1), key);
                                        System.out.println("Member added successfully : " + m1);
                                    }


                                    case 6 -> {
                                        libraray.displayAllMember();
                                    }

                                    case 7 -> {
                                        member.displayMemberId();
                                    }


                                    case 8 -> {
                                        System.out.println("Enter Id for search ");
                                        int memberId = sc.nextInt();
                                        libraray.searchMemberById(memberId);
                                    }

                                    case 9 -> {
                                        System.out.println("Enter Member Id For Removal");
                                        int memberId = sc.nextInt();
                                        libraray.removeMember(memberId);
                                    }


                                    case 10 -> {
                                        System.out.println("Enter old password for cross check");
                                        String oldPassword = sc.next();
                                        System.out.println("Enter new password");
                                        String newPassword = sc.next();
                                        head.setPassword(oldPassword, newPassword);
                                        System.out.println("Do you want to re-login now? : 1 for re-login");
                                        int login = sc.nextInt();
                                        if (login == 1) {
                                            adminCondition = false;
                                        }

                                    }

                                    case 11 -> {
                                        System.out.println("Enter old User Id for cross check");
                                        int oldPassword = sc.nextInt();
                                        System.out.println("Enter new User Id");
                                        int newPassword = sc.nextInt();
                                        head.setUserId(oldPassword, newPassword);
                                        System.out.println("Do you want to re-login now? : 1 for re-login");
                                        int login = sc.nextInt();
                                        if (login == 1) {
                                            adminCondition = false;
                                        }
                                    }
                                    case 12 -> {
                                        System.out.println(head.getPassword());
                                    }
                                    case 13 -> {
                                        System.out.println(head.getUserId());
                                    }

                                    case 0 -> {
                                        System.out.println("\n--------------------You have been logged Out From Admin---------------------\n");
                                        adminCondition = false;
                                    }

                                    default -> System.out.println("Credentials wrong, please try again");

                                }
                        }
                    } else {
                        System.out.println("Login Failed , try again");
                    }
                }
                case 3 -> {
                    System.out.println("Exiting Program");
                    condition = false;
                }

                default -> System.out.println("Invalid Input , try again");
            }

        }
    }
}
