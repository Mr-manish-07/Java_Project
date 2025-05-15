package practice.StringClass;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = new String("Manish Kumar Prajapati");
        String str1 = "Java Course";
        String str3 = "Java Course";
        String str4 = new String("Java Course");
        String str5 = "java course";

//        1. int length()
        System.out.println(str.length());

//        2. Char charAt(int i)
        System.out.println(str.charAt(10));

//        3. String substring (int i)   display from ith  index character to end
        System.out.println(str.substring(7));

//        4. String substring (int i, int j)
        System.out.println(str.substring(7,12));

//        5. String concat( String str)
        String str2 = str.concat(" HITK");
        System.out.println(str2);

//        6. int indexOf (String s)     return first occurrence only
        System.out.println(str2.indexOf('i'));
        System.out.println(str2.indexOf("Prajapati"));

//        7. int indexOf (String s, int i)
        System.out.println(str.indexOf("i",5));

//        8. Int lastIndexOf( String s)
        System.out.println(str2.lastIndexOf("a"));

//        9. boolean equals( Object otherObj)
        System.out.println(str1==str4);  // == check memory location not content
        System.out.println(str1.equals(str4)); // equals check content
        System.out.println(str1==str3);  // share same memory location

//        10. boolean  equalsIgnoreCase (String anotherString)
        System.out.println(str3.equalsIgnoreCase(str3)); // doesn't check small or capital alpbabet

//        11. int compareTo( String anotherString)
        // It's check every letter according to Unicode if any code having 64 Unicode and
        //  other having 67 then first letter will come first

        String strr1= "GeeksSsC"; // first comes first then -1
        String strr2 = "GeeKsssB";
        int comparison = strr1.compareTo(strr2);
        if (comparison < 0) {
            System.out.println(strr1 + " comes before " + strr2 + " lexicographically.");
        } else if (comparison > 0) {
            System.out.println(strr1 + " comes after " + strr2 + " lexicographically.");
        } else {
            System.out.println(strr1 + " and " + strr2 + " are lexicographically equal.");
        }

//        12. int compareToIgnoreCase( String anotherString)
        // Ignores letter whether is it big or small it , if both letter same means condition
        // satisfied but if any other letter found then if first string comes first then -1
        // if both equal then 0 and if last comes first then 1

        int compare = strr1.compareToIgnoreCase(strr2) ;
        System.out.println(compare);

//        13. String toLowerCase() 14.String toLowerCase()
        System.out.println(strr1.toLowerCase());
        System.out.println(strr2.toUpperCase());

//        15. String trim()
        String strr3 = new String("    java    ");
        System.out.println(strr3.length());
//        strr3=strr3.trim();
//        System.out.println(strr3+" "+strr3.length());

//        16. String replace (char oldChar, char newChar)
        String strr4 = strr3.replace(' ','_');
        System.out.println(strr4);

//        17. boolean contains(CharSequence sequence)
        // If giver character or string is available to the original string return true

        boolean val = str5.contains("course");
        boolean val2 = str5.contains("courses");
        System.out.println("val1 : "+val+"\nval2: "+val2);

//        18. Char[] toCharArray():
        String strr6 = "Java MasterClass course with spring boot framework";
        strr6 = strr6.replace(' ','-');
        char[] ch = strr6.toCharArray();
        System.out.println(Arrays.toString(ch));


//        19. boolean startsWith(String prefix)
        System.out.println(strr6.startsWith("java"));
        System.out.println(strr6.startsWith("Java"));





















    }
}
