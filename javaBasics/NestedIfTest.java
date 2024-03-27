package javaBasics;

public class NestedIfTest {

    /*
     * First your enter the house through main door
     * Then enter the stairway door
     * Then enter the Bedroom
     * Then Open the wardrobe
     * Then Open the valut 
     */

     int main_door_key = 342;
     int stairway_key = 451;
     int bedroom_key = 983;
     int wardrome_key = 676;
     int valut_key = 64529;

public void allowAccessToValut(){

    //Enter the house
    if(main_door_key == 342){
        System.out.println("The Main Door has Opened");
            // Enter the stairway
            if(stairway_key == 451){
                System.out.println("The Stairway Door has Opened");
                    //Enter the Bedroom 
                    if(bedroom_key == 983){
                        System.out.println("The Bedroom Door has Opened");
                            if(wardrome_key == 676){
                                System.out.println("The Wardrobe Door has Opened");
                                    if(valut_key == 64529){
                                        System.out.println("The Vault Door has Opened");
                                    }else{
                                        System.out.println("Sorry you couldn't open the Vault door");
                                    }
                            }else{
                                System.out.println("Sorry you couldn't open the wardrobe door");
                            }
                    }else{
                        System.out.println("Sorry you couldn't open the Bedroom door");
                    }
            }
            else{
                System.out.println("Sorry you couldn't open the Stairway door");
            }

    }
    // else{
        // System.out.println("Sorry you couldn't open the main door");
    // }

}

public static void main(String [] args){

    NestedIfTest nestedIfTest = new NestedIfTest();
    nestedIfTest.allowAccessToValut();

}
    
}
