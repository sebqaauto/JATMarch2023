package OOPS;

public class BaseBike1 {

    public int max_Speed = 100;
    public int wheels = 2;
    public int supensions = 1;
    public String engine_Type = "2 Stroke";
    public int basic_bike_service = 4;

    public int getBasicMaxSpeed(){
        return max_Speed;
    }

    public String getEngineType(){
        return engine_Type;
    }

    public void accelerate(){
        System.out.println("Has the basic Bike acceleration to acheive top speed of - "+max_Speed);
    }

    public void service(){
        System.out.println(" Base Bike service time is "+basic_bike_service + " months");
    }
    
}
