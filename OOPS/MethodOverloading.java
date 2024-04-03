package OOPS;

public class MethodOverloading {

    //Return type is not considered for Overloading 
    public void add(int a, int b){
        System.out.println("add() number 1");
        System.out.println("The addition result is "+ a+b);
    }

    //Data type of the parameter is different from the 1st add()
    public void add(float a, int b){
        System.out.println("add() number 2");
        System.out.println("The addition result is "+ (a+b));
    }
    // Number of parameters is different here from the 1st add() - total we have 3 parameters
    public int add(int a, int b, int c){
        System.out.println("add() number 3");
        System.out.println("The addition result is "+ a+b+c);
        return a+b+c;
    }
    // Order of the parameter is different - same type and same num of parameters
    public void add(int a, float b){
        System.out.println("add() number 4");
        System.out.println("The addition result is "+ (a+b));
    }

    public void add(int a, double b){
        System.out.println("add() number 5");
        System.out.println("The addition result is "+ a+b);
    }

    public void add(int a, String b){
        System.out.println("add() number 6");
        System.out.println("The concatenation result is "+ a+b);
    }
        
    
    public static void main(String []arg){

        MethodOverloading overloading = new MethodOverloading();

        overloading.add(4.5f, 7);
        overloading.add(4,5.44d);
        overloading.add(8, " Good Morning");
        overloading.add(5,8.9f);
    }
}
