package OOPS;

public abstract class AbstractTest1 {

    public AbstractTest1(){
        System.out.println("From the constructor of AbstractTest1()");
    }

    public void revealMessage(){

    }

    abstract void display();

    public static void main(String [] arg){

        //Cannot instantiate an abstract class
        //AbstractTest1 abstractTest1 = new AbstractTest1();
  

    }
 
}
