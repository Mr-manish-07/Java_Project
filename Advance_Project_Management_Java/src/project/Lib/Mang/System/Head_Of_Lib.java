package project.Lib.Mang.System;

public class Head_Of_Lib {

    //------------------------Attributes( Variable)--------------------------------

    private static int employeeId = 12;
    private static String password = "ab";
    public boolean login=false;

    //------------------------Composition Instead of inheritance--------------------

    private Member member;

/*--------------------------------------------------------------------------------------------------------------------*/

    public Head_Of_Lib(int employeeId1, String password1) {
        if(employeeId == employeeId1 && password.equals(password1)) {
            login = true;
        }
    }

    public void displayAllMemberId(){
        if (login) {
            for(Integer member1:Member.memberIds){
                System.out.println("Member ID: " + member1);
            }
        }
        else {
            System.out.println("Administrator Invalid Member");
        }
    }

    public boolean getLogin() {
        return login;
    }

    public String getPassword() {
            return password;
    }

    public void setPassword(String oldPass,String password) {
        if(oldPass.equals(this.password)) {
            this.password = password;
            System.out.println("Password Changed Successfully , Your New Password is: " + password);
            return;
        }

        System.out.println("Password Can't change due to Wrong password");
    }

    public int getUserId() {
            return employeeId;
    }

    public void setUserId(int oldUserId,int newUserId) {
        if(oldUserId == employeeId) {
            this.employeeId = newUserId;
            System.out.println("User Id Changed Successfully , Your New UserId is: " + newUserId);
            return;
        }

        System.out.println("User Id Can't change due to Old User Id is wrong");
    }
}
