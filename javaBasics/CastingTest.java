package javaBasics;

public class CastingTest {

    //Cating means converting one type to another type 

    //Implicit Casting and Explicit Casting 
    int i = 10;
    float floatVar;
    double doubleData=10;

    public void implicitCasting(){
            floatVar = i;
            doubleData = i;
            System.out.println(floatVar);
            System.out.println(doubleData);
    }

    public void explicitCasting(){
            i = (int)doubleData;
            System.out.println(i);
    }

    public static void main(String []args){
        CastingTest test = new CastingTest();
        test.implicitCasting();
        test.explicitCasting();
    }
}
