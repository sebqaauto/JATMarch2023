package javaBasics;

public class ForLoopTest2 {

    public static void main(String [] arg){

        //This logic is for half Pyramid

        //Outer represents the rows 
        for(int i=1; i<=4; i++){

            //Run the inner loop for 'i' num of times
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }

            System.out.println(" ");
        }

        //This logic is for full pyramid
        int row_layers = 6;

         //Outer represents the rows 
        for(int i=1; i<=row_layers-1; i++){

            //Inner loop to print spaces
            for(int k=i; k<row_layers - 1; k++){
                System.out.print(" ");
            }

            //Inner loop to print the stars 
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");

         }
    
}
}
