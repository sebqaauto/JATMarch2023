package javaBasics;

import java.util.Scanner;

//default package java.lang

public class FindEvenOdd {

    static{
        System.out.println("Hi from the static block1");
}
    // Declare variables 
    int int_number;

    // This method is having the logic to calculate even or Odd
    public void findEvenOrOdd(int number){
        int result = number%2;
        if(result == 0){
            System.out.println("The given number "+number+" is EVEN");
        }else{
                System.out.println("The given number "+number+" is ODD");
        }

    }

    // Logic to caoture the number from the User
    public void captureNumberFromUser(){
        
        System.out.println("Please enter an Integer :: ");
        Scanner scanner = new Scanner(System.in);
        int_number = scanner.nextInt();
    }
    public static void printMessage(){
        System.out.println("Hi from PrintMessage ");
    }

    static{
        System.out.println("Hi from the static block2");
}

    public static void main(String []args){

        //Create the Object to access non-static members
        FindEvenOdd findEvenOdd = new FindEvenOdd();

        // Capture the number from the user 
        //findEvenOdd.captureNumberFromUser();

        System.out.println("Please enter an Integer :: ");
        Scanner scanner = new Scanner(System.in);
        findEvenOdd.int_number = scanner.nextInt();

        // Call the logic to calculate Even or Odd
        findEvenOdd.findEvenOrOdd(findEvenOdd.int_number);

        printMessage();

    
    }


    static{
            System.out.println("Hi from the static block3");
    }
    
}
