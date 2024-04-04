package OOPS;

public class YamahaBike1 extends BaseBike1{

    public int max_Speed = 180;
    public int supensions = 2;
    public String engine_Type = "4 Stroke";
    public int basic_bike_service = 3;
    public void accelerate(){
        super.accelerate();
        System.out.println("Has the Yamaha's acceleration to acheive top speed of - "+max_Speed);
    }
    public void service(){
        super.service();
        System.out.println(" Yamaha Bike service time is "+basic_bike_service + " months");
    }

    public void speedDifference(){
        System.out.println(max_Speed);
        System.out.println(super.max_Speed);
        System.out.println("The Speed difference is "+ (max_Speed - super.max_Speed));
        }
    public static void main(String [] args){
        YamahaBike1 yamaha = new YamahaBike1();
        yamaha.accelerate();
        yamaha.service();
        yamaha.speedDifference();
    }
    
    
}
