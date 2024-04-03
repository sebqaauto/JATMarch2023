package OOPS;

public class ChildOverriding extends ParentOverridden{

    public int salary;

    @Override
    public void add(int a, int b){
      
        System.out.println("add() from Child class ");
        System.out.println("The addition result is "+ (a+b));
        super.add(34,56);
    }

    public void getSalary(){
        System.out.println("The salary of child is "+ salary);
        System.out.println("The salary of Parent is "+ super.salary);
    }

    //By default your child class default constructor will call the Parent class default constructor
    public ChildOverriding(){
        //super();
       // System.out.println("The salaray of Parent is "+ super.salary);
       System.out.println("Hi from Child Class Constructor");
    }

    public ChildOverriding(int salary){
        super(8000);
        this.salary = salary; 
    }
    
    public static void main(String []arg){

        ChildOverriding childOverriding = new ChildOverriding();
        System.out.println(childOverriding.name);
        //if the child has the same implementation, it will override the parent
        childOverriding.add(45, 56);
        ChildOverriding childOverriding2 = new ChildOverriding(350000);

        //ParentOverridden parentOverridden = new ParentOverridden();
        //parentOverridden.add(34, 56);

        childOverriding2.getSalary();

       // System.out.println("The salaray of Parent is "+ parentOverridden.salary);

       
    }
}
