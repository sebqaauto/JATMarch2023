package javaBasics;

public class TestUnary {

    public static void main(String []mon)
{
    // int Variables and they are initiaslised 
    int int_a = 10234;
    int int_b = 12;
    int counter = 0;

    // Variables could be re-initialised
       // int_a = int_a + 1;
       //int_a += 1; 

       //post increment operator 
       System.out.println(int_a++ + ++int_a + int_a++);
       System.out.println(int_a);
       //pre increment operator
       System.out.println(int_a);
       System.out.println(++int_a);


        System.out.println("The value of int_a is "+int_a);

        System.out.println(int_a++ + ++int_b + (int_a+int_b));


        //47  23 + (11 + 13)
        //45
        //


}    
}
