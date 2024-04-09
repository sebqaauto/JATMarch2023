package exceptions;

import java.util.Scanner;

//By extending Exception class custom exceptions can be created
public class LoginException extends Exception {

    //Java treats custom exception as checked exception category

    //To set the title/message for the custom exception
    public LoginException(String expceptionMessage){
        super(expceptionMessage);
    }

    public LoginException(){

    }
   

    public static void login() throws LoginException{
        LoginException loginException = new LoginException("Invalid User Entry");
        System.out.println("Please enter your user name ");
        Scanner scanner = new Scanner(System.in);
        String teamName = scanner.nextLine();

        if(teamName.equals("CSK")){
            System.out.println("Welcome to the Den ");
        }
        else{
            //throw new LoginException("Invalid User Entry");
            throw loginException;
        }
    }

    public static void main(String []args) throws LoginException {

        try {
            login();
            throw new LoginException("Invalid User Entry2");
        } catch (LoginException e) {
           
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }


    }

    
}
