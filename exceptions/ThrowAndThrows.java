package exceptions;

import java.util.Scanner;


public class ThrowAndThrows {

static void checkUserName() throws ArithmeticException, StringIndexOutOfBoundsException{

    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    if(name.equals("RCB")){
        throw new ArithmeticException();
    }
    else if(name.equals("PBKS")){
        throw new StringIndexOutOfBoundsException();
    }
    else{
        System.out.println("The string is "+name);
        name.replaceAll(name, name);
    }


}

    public static void main(String []args){
        checkUserName();
       

    }
    
}
