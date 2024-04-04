package abstraction;

public interface Chairman {

    //All the variables are public, static & final; - its turning in to constant
    int seniorStaffSalary = 60000;
    int principalSalaray = 90000;

    //Interface is used for acheiving 100% abstraction 
    //All the methods in the Interface are public by default
    void addNewStudents();
    void collectSchoolFee();
    void sceduleBusServices();

    //You cannot instantiate the interface 
    
}
