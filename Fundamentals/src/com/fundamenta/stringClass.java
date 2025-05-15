package com.fundamenta;

public class stringClass {
    @Override public String toString(){
        return "Lauda";
    }
    public static void main(String[] args) {
        String a = "Hello";
        String b = new String("Hello");
        String c ="Hello";
        String m = a.substring(2,3);
        String blank = "4";
        String nullStr = null + " ";
//        System.out.println(m);


        // testing string for equality
//        if(a.equals(b)) {
//            System.out.println("equals(obj) only check content inside the string class");
//        }
//        if(a==b){
//            System.out.println("but == checks memory location for the string");
//        }if(a==c){
//            System.out.println("but == checks memory location for the string for a==c is correct");
//        }
        if(blank.equals("") && nullStr=="") {
            System.out.println("Empty String");
        }else {
            System.out.println("Null can't be check as nullStr == '' or nullStr.equals(nullStr)");
        }
        if(nullStr==null){
            System.out.println("Null can be check by nullStr == null");
        }
        System.out.println("Character at "+ a.charAt(0) +"  should print H");
        System.out.println("Ascci code of a "+ a.codePointAt(0));
        System.out.println("Offset by code point "+a.offsetByCodePoints(0,4));
        System.out.println(a.compareTo(blank));
        System.out.println(a.codePointCount(0, 4));
        System.out.println(a.replace("Hello","Hello world"));
        System.out.println(a);


        // STRING BUFFER OR STRING BUILDER
        StringBuilder builder = new StringBuilder();
        char ch = '1';
        builder.append(ch);
        builder.append(" Hello");
        System.out.println(builder.toString());
        

    }

}
