package OOPS;

public class Car {

    public Car(){
        System.out.println("Hi from the Car constructor");
    }

    //Class Variables - Objects can't take a copy, it is common for all Objects, it can accessed without the help of Objects
    public static String car_Consortium;


    //Instance Variables - Each Object of the class will have copy of the Instance variables
    public String car_Name;
    public String car_Manu_Year;
    public String car_Color;
    public String wheelType;
    public String brakeType;

    public void addAirBags(){

    }

    public void wheel(String wheelType){

        System.out.println("The wheeType for the "+car_Name+ " is " + wheelType);
    }

    public void brakeType(String brakeType){
        System.out.println("The brake type for this "+car_Name+ " is "+brakeType);
    }


    public static void main(String [] cars_arg){

        car_Consortium = "wwww.carconsortium.com";

        Car swift = new Car();
        swift.car_Name = "Maruti Swift";
        System.out.println(swift.car_Name);
        swift.car_Color = "RED";
        System.out.println(swift.car_Color);

        Car bmw = new Car();
        bmw.car_Name = "BMW Special Edition";
        System.out.println(bmw.car_Name);
        System.out.println(bmw.car_Color);

        System.out.println(swift.car_Name);

        System.out.println(bmw.car_Name);

        System.out.println(car_Consortium);

        System.out.println(bmw.car_Consortium);

        bmw.car_Consortium = "https://wwww.carconsortium.com";

        System.out.println(swift.car_Consortium);

    }
    
}
