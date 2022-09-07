package javaProvlems;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String word= "Home";
        String reverse= "";
        for(int a=word.length()-1; a>=0;a--){
            reverse= reverse+ word.charAt(a);
            System.out.println(reverse);
        }
    }
}
