package sdetJava;

public class Operators {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        // Arithmetic operators -->  +  - * /  %
        System.out.println("Sum of value is:" +(a+b));
        System.out.println("Dif of a and b is:" +(b-a));
        System.out.println("Mul of a and b is:" +(a*b));
        System.out.println("Div of a and b is:" +(a/b));
        System.out.println("Mod Div of a and b is:" +(a%b));

        // Relational Operators (Comparison operators) ---> == < > <= >= !=
        //Always return boolean value
        System.out.println(a==b);// false
        System.out.println(a>b);// false
        System.out.println(a<b);// true
        System.out.println(a>=b);// false
        System.out.println(a<=b);// true
        System.out.println(a!=b);// // true
        //Logical operators &&  || !
        // Works between two boolean

        boolean x=true;
        boolean y=false;
        System.out.println(x && y);// false
        System.out.println(x || y); // true
        System.out.println(!x);// false

    }
}
