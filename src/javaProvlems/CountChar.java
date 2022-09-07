package javaProvlems;

public class CountChar {
    public static void main(String[] args) {
        CountChar ch = new CountChar();
        int count=ch.countChar("August");
        System.out.println(count);

    }
     int countChar(String month) {
        char [] chars= month.toCharArray();
        int counter =0;
        for (char x: chars){
            if (x == 'a' || x=='A') {
                counter++;
            }
        }
        return counter;

    }

}
