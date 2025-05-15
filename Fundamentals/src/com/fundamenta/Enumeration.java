package com.fundamenta;

public class Enumeration {
    public static void main(String[] args) {
        enum Size {SMALL, MEDIUM, LARGE,EXTRA_LARGE};
        Size s = Size.SMALL;
        Size m = Size.MEDIUM;
        Size l = Size.LARGE;
        Size xl = Size.EXTRA_LARGE;
        System.out.println(s+" "+m+" "+l+" "+xl);
    }
}
