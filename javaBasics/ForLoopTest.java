package javaBasics;

public class ForLoopTest {
    
    public static void main(String [] arg){

        //Outer loop will represent the Rows
        for(int i=1; i<=4; i++){
            //Inner Loop will represent column 
                for(int j=1; j<=5; j++){
                    System.out.print(i*j+ " "); // this statement runs for 20 times
                }
                System.out.println(" ");    // this statement runs for 4 times   
        }


        //Write for loops to print tables in maths 

        //Outer foor loop will control the table 1, 2, 3 table etc ...
        for(int i=1; i<=10; i++){
            System.out.println("The table "+i+ " has started ..");// 10 times
                for(int j=1; j<=10; j++){
                    System.out.println(i+ " * "+ j +" = "+i*j);// 100 times
                }
                System.out.println("The table "+i+ " is completed ...");// 10 times
        }
    }
}
