package OOPS;

public class CarTest {



//Class Variables 
public static String car_Consortium;


//Instance Variables 
public String car_Name;
public String car_Manu_Year;
public String car_Color;
public String wheelType;
public String brakeType;

public void wheel(){
    System.out.println("The wheeType for the "+car_Name+ " is " + wheelType);
}

public void brakeType(){
    System.out.println("The brake type for this "+car_Name+ " is "+brakeType);
}

public CarTest(){
    car_Name = "Four Wheeler";
    car_Manu_Year = "1900";
    car_Color = " White/Grey";
    wheelType = " Nylon tyres";
    brakeType = " Brake Shoes";

}
static int counter = 0;
public CarTest(String carname, String carYear, String carColor, String wheeltype, String braketype){
    car_Name = carname;
    car_Manu_Year = carYear;
    car_Color = carColor;
    wheelType = wheeltype;
    brakeType = braketype;
System.out.println("The parameterised constructor is called for the "+ ++counter+ " time(s)");
}



public static void main(String [] args){

CarTest carTest = new CarTest();

CarTest swifTest = new CarTest("Swift Dezire", "2010", "RED and BLACK", "Zipper Tyres", "Disc Brake");

CarTest bmwTest = new CarTest("BMW", "2012", "Blue", "Alloy Wheel", "ABS");

CarTest hondaTest = new CarTest("Honda Civic", "2008", "White", "Alloy Wheel", "Hydarulic");


System.out.println(carTest.car_Name + " || "+swifTest.car_Name + " || "+bmwTest.car_Name + " || "+hondaTest.car_Name);
System.out.println(carTest.car_Manu_Year + " || "+swifTest.car_Manu_Year + " || "+bmwTest.car_Manu_Year + " || "+hondaTest.car_Manu_Year);
System.out.println(carTest.car_Color + " || "+swifTest.car_Color + " || "+bmwTest.car_Color + " || "+hondaTest.car_Color);
System.out.println(carTest.wheelType + " || "+swifTest.wheelType + " || "+bmwTest.wheelType + " || "+hondaTest.wheelType);
System.out.println(carTest.brakeType + " || "+swifTest.brakeType + " || "+bmwTest.brakeType + " || "+hondaTest.brakeType);


swifTest.wheel();
swifTest.brakeType();

bmwTest.wheel();
bmwTest.brakeType();

}
    
}
