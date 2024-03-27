package javaBasics;

import java.util.Scanner;

public class IfElseTest {

    //Get the Age from the user 
    //Less than 5 KG room
    //Greater than 5 and less than 10 play area 
    //Age between 10 to 20 Video game room 
    //Age between 20 to 30 Carrom Room 
    //Age between 30 to 45 Chess Room
    //Age > 45 Main Hall

    /*
     * Declare a varibale to capture Age
     * Get the Age from the user 
     * Logic to find which Age category they are and assign rooms to them
     */

     static int int_Age;

     // Need a method to get Age from the User
     public static void getUserAge(){
        System.out.println("Please Enter your age ");
        Scanner scanner = new Scanner(System.in);
        int_Age = (int) scanner.nextFloat();

     }

     //Logic to find which age category can occuoy which room
     public static void assignRooms(int Age){

        if(Age <= 5 ){
            System.out.println("The person has Age "+Age+ " has to go to KG Room");
        }
        else if(Age > 5 && Age <=10){
            System.out.println("The person has Age "+Age+ " has to go to Play Area");
        }
        else if(Age > 10 && Age <=20){
            System.out.println("The person has Age "+Age+ " has to go to Video Game Room");
        }
        else if(Age > 20 && Age <=30){
            System.out.println("The person has Age "+Age+ " has to go to Carrom Room");
        }
        else if(Age > 30 && Age <=45){
            System.out.println("The person has Age "+Age+ " has to go to Chess Room");
        }
        else{
            System.out.println("The person has Age "+Age+ " has to go to Main Hall");
        }


     }

     public static void main(String [] args){

        getUserAge();
        assignRooms(int_Age);

     }


    
}
