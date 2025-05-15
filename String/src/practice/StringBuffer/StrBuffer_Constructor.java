package practice.StringBuffer;

public class StrBuffer_Constructor {


    public static void main(String[] args) {
        String str1 = "Java Course";
        StringBuffer sb = new StringBuffer("Java Course");  // It reserves room for 16 characters without reallocation
        StringBuffer sb2 = new StringBuffer(100);  // Size can be passed as parameter
        StringBuffer sb3 = new StringBuffer(str1);
        // 16 reserve and 11 new word added so capacity is 27
        System.out.println(sb.capacity());
        System.out.println(sb2);
        System.out.println(sb3);
    }
}
