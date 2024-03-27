package javaBasics;

public class BitwiseOperators {

    public static void main(String [] tue){

        int int_a = 8;
        int int_b = 10;

        System.out.println(int_a & int_b);
        System.out.println(int_a | int_b);
        System.out.println(int_a ^ int_b);
        System.out.println(~int_a);

        System.out.println(int_a > int_b ? int_a*10 : int_b *10);

        System.out.println(int_a<<2);
        System.out.println(int_b<<2);
    }
    
}
