package javaProvlems;

import java.util.Arrays;

public class FindNmuber {
    public static void main(String[] args) {
        int[] numbers= {2,5,6,8,12,9,16,22,86,45};
        Arrays.sort(numbers);
        for(int i=0;i< numbers.length;i++){
            System.out.println(i);
        }
        // Smallest number
        System.out.println(numbers[0]);
        // Second smallest number
        System.out.println(numbers[1]);
        // Largest number
        System.out.println(numbers[numbers.length-1]);
        // Second largest number
        System.out.println(numbers[numbers.length-2]);

    }
}
