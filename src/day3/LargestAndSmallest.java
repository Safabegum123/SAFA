package day3;

import java.util.Arrays;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int ar[] = {123, 12, 4, 5, 567, 45, 334, 445};
        Arrays.sort(ar);
        for (int b = 0; b < ar.length; b++)
        {
            System.out.println(b);
        }
        System.out.println(ar[0]);
        System.out.println(ar[ar.length-1]);
    }
}
    //tagname[@attribute="value"]/tagname[2]
