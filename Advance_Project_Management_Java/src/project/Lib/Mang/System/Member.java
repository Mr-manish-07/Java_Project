package project.Lib.Mang.System;

import java.util.ArrayList;
import java.util.List;

public class Member {

    //------------------------Attributes( Variable)-----------------------------

    private static int member_id = 6200;
    private int tempId;
    public static List<Integer> memberIds = new ArrayList<>();
    private String member_contact;
    public boolean member_login = false;
    protected List<Integer> borrowed_books_id = new ArrayList<>();


//------------------------Composition Instead of inheritance--------------------

    private Book book;
    private Libraray libraray;
    private Head_Of_Lib head;


/*--------------------------------------------------------------------------------------------------------------------*/


    //---------------------------Constructor-------------------------------------
    public Member(){};

    public Member(String regNo , String phoneNumber,String collegeId) {

        try {
            long startPhone = Long.parseLong("6000000000");
            long endPhone = Long.parseLong("9999999999");
            long reg = Long.parseLong(regNo);
            long phone = Long.parseLong(phoneNumber);
            long college = Long.parseLong(collegeId);
            if ((reg >= 100000 && reg <= 999999) && (phone >= startPhone && phone <= endPhone)
                    && (college >= 200000 && college <= 299999)) {
                this.member_contact = String.valueOf(phoneNumber);
                member_id+=5;
                memberIds.add(member_id);
                member_login = true;
            }else{
                System.out.println("Data Mismatch , Library Id unable to generate");
            }
        }
        catch (Exception e) {
            System.out.println("You haven't access of libraray , due to mismatch data");
        }
    }

    public Member(String member_contact, int member_id){
        for (Integer memberId : memberIds) {
            if (memberId == member_id) {
                this.member_contact = member_contact;
                this.tempId = member_id;
                break;
            }
        }
    }

    //-------------------------Instance Method-----------------------------------


    public int getMember_id() {
            return member_id;

    }

    public void displayMemberId(){
        System.out.println(memberIds.toString());
    }

    public String getMember_contact() {
            return member_contact;
    }

    @Override
    public String toString() {
        if(member_login) {
            return "\nMember{" +
                    "member_contact='" + member_contact + '\'' +
                    ", member_login=" +  "Login Success" +
                    '}' ;
        }
        return "Member{" +
                "member_contact='" + member_contact + '\'' +
                ", member_login=" + "Login Failed" +
                '}';
    }
}
