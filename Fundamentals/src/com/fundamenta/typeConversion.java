package com.fundamenta;

public class typeConversion {

    public static void main(String[] args) {
        int a = 5;
        float b = a;
        double c = 9.999;
        int d = (int) c;
        int round = (int) Math.round(c);
        System.out.println(b + " " + d );
    }
}
