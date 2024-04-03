package javaBasics;

public class StarTest {

    public static void main(String [] arg){
        int row_size = 5;


        //Outer lopp for the rows
        for(int i =1; i<=row_size; i++){

            //Inner loop for Columns
            for(int j=1; j<=row_size; j++){

                if(j == i || j == row_size -i +1){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
    
}
