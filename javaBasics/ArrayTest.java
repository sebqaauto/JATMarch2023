package javaBasics;

import java.util.Scanner;

public class ArrayTest {

  static char c;

    public static void main(String arg [] ){

      System.out.println(c);

      int roll_no[] = new int[4];
        
        int int_arr[] = new int[5]; // Array starts with index 0, 1, 2, 3, 4
        long long_arr[] = new long[3]; // Array starts with index 0, 1, 2
        float float_arr[] = {34.5f, 55.5f, 332.34f, 45.45f};
        double doub_arr[] = new double[3];
        char char_arr[] = {'W', 'e', 'd'};
        String str_arr[] = new String[4];

        int_arr[0] = 12;
        int_arr[1] = 14;
        int_arr[2] = 12;

        float_arr[4] = 56.56f;
    

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("The length of the array is "+int_arr.length);
        System.out.println(c);
    

        for(int i=0; i<5; i++){
            System.out.println(int_arr[i]);
          }


        for(int i=0; i<=int_arr.length-1; i++){
           int_arr[i] = i * 2;
        }

        for(int int_temp : int_arr) {
          System.out.println(int_temp);
        }

        for(float temp : float_arr) {
          System.out.println(temp);
          //casting 
          int int_temp = (int) temp;
        }

        for(int i=0; i<3; i++){
          System.out.println("Enter the value for array index "+ i);
          str_arr[i] = scanner.next();

        }
        System.out.println(str_arr);

        for (String string : str_arr) {
            System.out.println(string);
        }

 

   


    }
    
}
