package OOPS;

public class ParentOverridden {

    public String name = "Parents";

    public int salary = 5000;

    public ParentOverridden(){
        System.out.println("Hi from the Parent constructor");
    }

    public ParentOverridden(int salary){
        System.out.println("Hi from parameterised super class constructor");
        this.salary = salary;
    }

    public void add(int a, int b){
        System.out.println("add() from parent class ");
        System.out.println("The addition result is "+ (a+b));
    }


    
}
