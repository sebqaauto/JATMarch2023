package javaBasics;

public class TestLogicalOperator {

    public static void main(String[] mon){

       // && Logical AND
       // || Logical OR
       // ! Logical NOT

        int int_a = 10, int_b=20, int_c=32;

        // comparing C with both variables a & b 
        // compare a & b then compare it with c
        boolean bool_flag = int_c > int_b && int_c > int_a && int_c > (int_a+int_b);

        if(bool_flag){
            //satisfied
            System.out.println("int_c is the greatest of the numbers "+int_c);
        }

        boolean bool_flag2 = int_c > int_b || int_c > int_a;
        if(bool_flag2){
            //satisfied
            System.out.println("int_c is the greater than atleast one number "+int_c);
        }

        boolean bool_flag3 = !(int_c < int_b || int_c < int_a);
        if(bool_flag3){
            //satisfied
        System.out.println("From the logical Not block - int_c is the greater than atleast one number "+int_c);
}

    }
    
}
