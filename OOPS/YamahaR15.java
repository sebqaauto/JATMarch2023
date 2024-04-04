package OOPS;

public class YamahaR15 extends YamahaBike1 {
    

    public void accelerate(){
        super.accelerate();
        System.out.println("Has the Yamaha's R15 acceleration to acheive top speed of - "+ (max_Speed+20));
    }

    public void speedDifference(){
    System.out.println(max_Speed);
    System.out.println(super.max_Speed);

    }

    public static void main(String [] args){

        YamahaR15 yamahaR15 = new YamahaR15();

        yamahaR15.accelerate();
        yamahaR15.service();
        yamahaR15.speedDifference();
        System.out.println(yamahaR15.getBasicMaxSpeed());
        System.out.println(yamahaR15.getEngineType());

        BaseBike1 baseBike1 = new BaseBike1();
        baseBike1.accelerate();

    }

}
