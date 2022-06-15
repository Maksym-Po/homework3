package com.company;

public class Main {
    public static void main(String[] args) {
        byte a = 10;
        short b = 100;
        int c = 10000;
        long d = 10000000L;
        float x = 1.0006852f;
        double g = 10000.65358523;
        char e = 'Z';
        boolean v = true;

        System.out.println("Значение типа Byte = " + a);
        System.out.println("Значение типа Short = " + b);
        System.out.println("Значение типа Int = " + c);
        System.out.println("Значение типа Long = " + d);
        System.out.println("Значение типа Float = " + x);
        System.out.println("Значение типа Double = " + g);
        System.out.println("Значение типа Char = " + e);
        System.out.println("Значение типа Boolean = " + v);

        long w = 1000_0000L;
        float q = 100.066_123_455f;
        double tet = 1550_0088.4433_112_201;

        System.out.println(w);
        System.out.println(q);
        System.out.printf("%.10f", tet);

        char hip = '\u00AE';
        char hip1 = '\u00B5';
        char hip2 = '\u00A9';

        System.out.println(hip);
        System.out.println(hip1);
        System.out.println(hip2);


    }
}