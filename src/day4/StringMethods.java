package day4;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String s="welcome";
        String j="to java";
        String ss="Be source of your own happiness";
        System.out.println(s.length());// length of string
        System.out.println(s.concat(j));// joining of strings
        // Trimming the string
        s="     welcome    ";
        System.out.println("Beforte trimming string is:" +s);
        System.out.println("After trimming string is:" + s.trim());
        System.out.println(j.substring(2,5));//
        System.out.println(j.contains("to"));// find character from string
        System.out.println(j.charAt(3));// return character based on index number
        s="welcome";
        System.out.println(s.equals("welcome"));
        System.out.println(s.equals("Welcome"));
        System.out.println(s.equals("wel come"));
        System.out.println(s.equalsIgnoreCase("Welcome"));
        ss="Be source of your own happiness";
        System.out.println(ss.replace('o','p'));
        System.out.println(ss.replace("of","in"));
        System.out.println(ss.toLowerCase());
        System.out.println(ss.toUpperCase());
        char[] sm=ss.toCharArray();
        System.out.println(sm.length);
        for(char x:sm) {
            System.out.println(x);
        }
    }
}
