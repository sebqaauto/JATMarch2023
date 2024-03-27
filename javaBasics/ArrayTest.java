package javaBasics;

public class ArrayTest {

    public static void main(String []arg){
        
        int int_arr[] = new int[5]; // Array starts with index 0, 1, 2, 3, 4
        long long_arr[] = new long[3]; // Array starts with index 0, 1, 2
        float float_arr[] = {34.5f, 55.5f, 332.34f, 45.45f};
        double doub_arr[] = new double[3];
        char char_arr[] = {'W', 'e', 'd'};
        String str_arr[] = new String[4];

        int_arr[0] = 12;
        int_arr[1] = 14;
        int_arr[2] = 12;
        int_arr[3] = 14;
  

        for(int i=0; i<5; i++){
            System.out.println(int_arr[i]);
          }


        for(int i=0; i<4; i++){
           int_arr[i] = i * 2;
        }

        for(int i=0; i<5; i++){
           System.out.println(int_arr[i]);
         }

       


    }
    
}
