package javaBasics;

public class TestComparison {

    public static void main(String[] monday){

        int int_a = 10;
        int int_b = 10;
        boolean bool_flag_equal = false;
        boolean bool_flag_Notequal = false;
        boolean bool_flag_greaterThan = false;
        boolean bool_flag_lesserThan = false;

       boolean flag =  int_a == int_b;
        if(flag){
            // satisfied
            bool_flag_equal = true;
        }

        System.out.println("The value of the flag is "+bool_flag_equal);

        if(int_a != int_b){
            // satisfied
            bool_flag_Notequal = true;
        }
        System.out.println("The value of the bool_flag_Notequal is "+bool_flag_Notequal);

        if(int_a >= int_b){
            // satisfied
            bool_flag_greaterThan = true;
        }
        System.out.println("The value of the bool_flag_greatThan is "+bool_flag_greaterThan);

        if(int_a <= int_b){
            // satisfied
            bool_flag_lesserThan = true;
        }
        System.out.println("The value of the bool_flag_lesserThan is "+bool_flag_lesserThan);

    }
    
}
