package abstraction;

public abstract class MidSeniorStaff extends SeniorStaff1{

    public MidSeniorStaff(){
        //super
        System.out.println("From the Constructor of MidSeniorStaff class");
    }

    @Override
    public void conductSportsEvent() {
        System.out.println("The MidSeniorStaff is responsible for conducting sporting events this year");
        
    }

    @Override
    public void conductAnnualDay() {
        System.out.println("The MidSeniorStaff is responsible for conducting Annual day events this year"); 
       
    }
    
}
