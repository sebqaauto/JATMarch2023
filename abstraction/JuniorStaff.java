package abstraction;

public class JuniorStaff extends MidSeniorStaff{

    public JuniorStaff(){
        //super
        System.out.println("From the Constructor of JuniorStaff class");
    }

    @Override
    public void teachAndEngage() {
        System.out.println("The JuniorStaff is responsible for teaching and engaging with Srudents");
    }

    public static void main (String []args){
        //When a sub class is instantiated, then its base class default constructor is invoked;
        JuniorStaff juniorStaff = new JuniorStaff();

        juniorStaff.conductAnnualDay();
        juniorStaff.conductSportsEvent();
        juniorStaff.deliverWelcomeAddress();
        juniorStaff.schedulePTM();
        juniorStaff.teachAndEngage();
        System.out.println(Chairman.principalSalaray);
    }

    @Override
    public void takeStudentTour() {

    }

    @Override
    public void addNewStudents() {


    }

    @Override
    public void collectSchoolFee() {
       
       
    }

    @Override
    public void sceduleBusServices() {

    }

    
}
