
/*
 * This is my first java program 
 * 
 */

//This is package declaration
package javaBasics;

//Class declaration 
public class MyFirstTest3 {

    static boolean bool_data;
    static int int_Data2;
    static float float_Data2;

    public static void main(String []a){

        System.out.println("This is the first statement from the main method");

        //Declaring variables - primitive data types

        byte _byte_Data1 = -128;
        short $short_Data1 = 32767;
        int int_Data_1 = 2147483647;
        long long_Data = 9223372036854775807l;
        int int_data_1 = 45;

        int d = 4;
        int e = 8;

        System.out.println("d & e: " + (d & e));
        System.out.println("d | e: " + (d | e));
        System.out.println("d ^ e: " + (d ^ e));

        System.out.println("The value of byteData1 is "+_byte_Data1);
        System.out.println("The value of shortData1 is "+$short_Data1);
        System.out.println("The value of intData1 is "+int_Data_1);
        System.out.println("The value of longData1 is "+long_Data);
        System.out.println("The defalut value of boolean is "+bool_data);
        System.out.println("The defalut value of int is "+int_Data2);
        System.out.println("The defalut value of float is "+float_Data2);



    }

    public void doAddtionForIntegers(){

    }
}
