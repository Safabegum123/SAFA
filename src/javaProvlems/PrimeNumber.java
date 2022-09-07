package javaProvlems;

public class PrimeNumber {
    public static void main(String[] args) {
        int number= 70;
        boolean prime= true;
        for(int i=2;i<number/2;i++) {
            if(number%i==0) {
                prime=false;
            }
        }
        System.out.println(prime);

    }
}
