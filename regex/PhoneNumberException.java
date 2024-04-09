package regex;

import java.util.Scanner;

//By extending Exception class custom exceptions can be created
public class PhoneNumberException extends Exception {

    //Java treats custom exception as checked exception category

    //To set the title/message for the custom exception
    public PhoneNumberException(String expceptionMessage){
        super(expceptionMessage);
    }

    
    
    public PhoneNumberException(){

    }
   
//Capture the phone number untill the user enters a valid 
//If the user has exceeded 3 and on the 4th attempt throw him/her an exception
    public static void getUserPhoneNumber() throws PhoneNumberException{
        PhoneNumberException phoneNumberExceptionException = new PhoneNumberException("Invalid PhoneNumber and Exceeded 3 attempts");
        int counter=0;
        boolean result;
        String phoneNumber;
        do{ 
        System.out.println("Please enter your phone name ");
        Scanner scanner = new Scanner(System.in);
        phoneNumber = scanner.nextLine();
        //Valid phonne number should be having - 10 digits or + size can 10 to 13
        //+919956787345
         result = phoneNumber.matches("[+0-9]{10,13}");
         counter++;
            //Throw the user defined exception when the user exceeds 3 attempts
            if(counter == 4){
                throw phoneNumberExceptionException;
            }
            scanner.close();
        }while(!result);
        System.out.println("Thanks for entering valid phoneNumber "+phoneNumber);

    }

    public static void main(String []args) {

       
    try {
        getUserPhoneNumber();
    } catch (PhoneNumberException e) {
        
        e.printStackTrace();
        System.out.println(e.getMessage());
        System.out.println(e.getMessage());
    }
       
       
       
       
       
       


    }

    
}

