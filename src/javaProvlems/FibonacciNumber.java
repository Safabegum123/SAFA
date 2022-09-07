package javaProvlems;

import java.util.ArrayList;

public class FibonacciNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        for(int i=2;i<20;i++){
            numbers.add(numbers.get(i-1)+ numbers.get(i-2));
        }
        System.out.println(numbers);
    }
}
