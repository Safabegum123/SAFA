package javaProvlems;

import java.util.Arrays;

public class LargestNumberNew {
    public static void main(String[] args) {
        int a[] = {23,2,11,45,56,78,6,9,80,43};
        int b= a.length;
        Arrays.sort(a);
        System.out.println(a[b-1]);
        System.out.println(a[0]);
    }
}
