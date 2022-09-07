package day4;

public class SingleDimensionalArray {
    public static void main(String[] args) {
       /* int b[]=new int[5];
        b[0]=100;
        b[1]=200;
        b[2]=300;
        b[3]=400;
        b[4]=500;*/


        int a[] = {12, 24, 22, 67, 87, 98, 334, 56};
       /* System.out.println(a.length);// print length of array or size
        System.out.println(a[2]);// read specific value
        for(int i=0;i<=a.length-1;i++){// print array
            System.out.println(a[i]);
        }*/
        for(int i:a) { // read value using for loop and print array
            System.out.println(i);
        }
    }
}
