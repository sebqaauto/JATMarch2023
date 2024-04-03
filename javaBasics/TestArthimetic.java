package javaBasics;

public class TestArthimetic {

    int int_a = 34, int_b = 44;
    static float percent_Data = 80.78f;

    public static void main(String []a_1){
        // Create an Object to refer the non-static members inside our static main method
        // className object_name = new className();
        TestArthimetic testArthimetic = new TestArthimetic();
        testArthimetic.doAddtionForIntegers();
        testArthimetic.doSubractionForIntegers();
        testArthimetic.doMultiplicationForIntegers();
        testArthimetic.findModuloForIntegers();
    }

    void doAddtionForIntegers(){
        int result = int_a + int_b;
        System.out.println("The addition result is "+ (int_a+int_b));
        System.out.println("The addition result is "+ result);
        System.out.println("The addition result is "+ percent_Data);
    }

    void doSubractionForIntegers(){
        int result = int_a - int_b;
        System.out.println("The subraction result is "+ (int_a-int_b));
        System.out.println("The result is "+ result);
    }

    void doMultiplicationForIntegers(){
        int result = int_a * int_b;
        System.out.println("The multiplication result is "+ int_a*int_b);
        System.out.println("The result is "+ result);
    }

    void findModuloForIntegers(){
        int result = int_b % int_a;
        System.out.println("The Reminder result is "+ int_b%int_a);
        System.out.println("The result is "+ result);
    }
    
}
