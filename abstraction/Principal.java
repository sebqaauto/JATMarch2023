package abstraction;

public abstract class Principal implements Chairman {
    public Principal(){
        System.out.println("From the Constructor of Principal class");
    }

public abstract void teachAndEngage();    

public abstract void schedulePTM();

public abstract void conductSportsEvent();

public abstract void conductAnnualDay();

public abstract void takeStudentTour();

public void deliverWelcomeAddress(){
    System.out.println("the Principal is responsible for delivering the welcome Address");
}
    
}
