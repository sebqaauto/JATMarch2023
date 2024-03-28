package javaBasics;

public class StringTest {

    int int_a;

    public void showMessage(){

    }
    public static void main(String [] arg){

        StringTest stringTest = new StringTest();
        stringTest.showMessage();
        //Declaring a String using a variable - 
        //actually it is a String Object and behaves like a variable
        //and hence it can re initialised
        String str_word1;
        String str_word2;
        String str_word3;

        //Intialising or assigning values to the String 
        str_word1 = "Hello";
        str_word3 = str_word1;
        str_word1 = "Hello World";
        str_word2 = new String("Hello");
    

        //Compare the Strings
        if(str_word3 == str_word2){
            System.out.println("Both are same ");
        }
        else{
            System.out.println("Both are Not same ");
        }


        if(str_word2.equals(str_word3)){
            System.out.println("Comparison from equals method - Both are same ");
        }
        else{
            System.out.println("Comparison from equals method - Both are Not same ");
        }

        System.out.println(str_word1);

        str_word2 = "Hello World";

         //Compare the Strings
        if(str_word1 == str_word2){
            System.out.println("Comparing using == Both are same ");
            }
        else{
        System.out.println("Both are Not same ");
        }


    }
    
}
