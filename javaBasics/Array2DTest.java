package javaBasics;

import java.util.Scanner;

public class Array2DTest {

    public static void main(String []arg){

        // 2D array and represents rows and columns
        int arr [][] = new int[3][4];
        String str_2Darray [][] = new String[3][3];
        Scanner scanner = new Scanner(System.in);
        arr[0][0] = 34;

        //Outer loop controls the rows
        for(int i=0; i<3; i++){
            //Inner loop controls the columns
            for(int j=0; j<4; j++){
                    arr[i][j] = i+j*2;
                    System.out.print(arr[i][j]+"   ");
            }
            System.out.println("    ");
            System.out.println("    ");
        }

         //Outer loop controls the rows
            for(int i=0; i<3; i++){
                //Inner loop controls the columns
                    for(int j=0; j<3; j++){
                        System.out.println("Enter the values at the index position "+i+","+j);
                        str_2Darray[i][j] = scanner.next();
                }
            }


            for(int i=0; i<3; i++){
                //Inner loop controls the columns
                    for(int j=0; j<3; j++){
                        System.out.print(str_2Darray[i][j]+ "   ");
                        
                }
                System.out.println("    ");
                System.out.println("    ");
            }

    }
    
}
