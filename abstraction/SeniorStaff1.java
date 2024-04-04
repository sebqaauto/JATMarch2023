package abstraction;

public abstract class SeniorStaff1 extends Principal{

    public SeniorStaff1(){
        System.out.println("From the Constructor of SeniorStaff1 class");
    }

    @Override
    public void schedulePTM() {
        System.out.println("SeniorStaff1 is responsible for the PTM");
    }

    }
    
