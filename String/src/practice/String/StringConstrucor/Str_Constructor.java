package practice.String.StringConstrucor;

import java.nio.charset.Charset;

public class Str_Constructor {
    public static void main(String[] args) {

//    1. String(byte[] byte_arr)         Construct a new String by decoding the byte array

        byte arr[] = {77,97,110,105,115,104};
        String str = new String(arr);
        System.out.println(str);

//    2. String(byte[] byte_arr, Charset char_set)          Construct a new String by decoding the byte array. It uses the char_set for decoding.

        Charset cs = Charset.defaultCharset();
        String str1 = new String(arr,cs);
        System.out.println(str1);

//    3. String(byte[] byte_arr, int start_index, int length)     Construct a new string from the bytes array depending on the start_index(Starting location) and length(number of characters from starting location).

        String str2 = new String(arr,1,4);
        System.out.println(str2);


//    4. String(byte[] byte_arr, int start_index, int length, Charset char_set)

        String str3 = new String(arr,0,3,cs); // last index not included
        System.out.println(str3);


//    5. String(char[] char_arr)            Allocates a new String from the given Character array.
        char arrCh[] = {'j','a','v','a','_','p','r','o','g','r','a','m'};
        String str4 = new String(arrCh);
        System.out.println(str4);

//    6. String(char[] char_array, int start_index, int count)

//    7. String(int[] uni_code_points, int offset, int count)

        int[] arrInt ={98,66,78,224,903,234,37};
        String str5 = new String(arrInt,0, 6); //count specify how much element from do you want to operate
        System.out.println(str5);


//    8. String(StringBuffer s_buffer)
        StringBuffer str6 = new StringBuffer("manish");
        String str7 = new String(str6);
        System.out.println(str7);

//    9. String(StringBuilder s_builder)
        StringBuilder str8 = new StringBuilder("kumar");
        String str9 = new String(str8);
        System.out.println(str9);





























    }




}
