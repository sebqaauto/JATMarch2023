package OOPS;

import java.util.Scanner;

public class CollegeAndStudent {

    //Class variables
    static String college_Name;
    public static String college_Chairperson;

    //Instance Variables 
    public String dept;
    public String student_name;
    public String student_roll;

    public CollegeAndStudent(String college_name, String college_chairperson){
        college_Name = college_name;
        college_Chairperson = college_chairperson;
        System.out.println("The name of the College is "+college_Name);
        System.out.println("The name of the Chariperson is "+college_Chairperson);
    }

    public CollegeAndStudent(String student_name, String student_roll2, String dept){

        this.student_name = student_name;
        this.student_roll = student_roll2;
        this.dept = dept;
        System.out.println("The name of the Student is "+student_name);
        System.out.println("The name of the Student roll num is "+student_roll);
        System.out.println("The name of the dept is "+dept);

    }

    public void getStudentName(){
        System.out.println("From the Getter method The name of the Student is "+student_name);
    }

    public void getStudentRollNo(){
        System.out.println("From the Getter method The name of the Student roll num is "+student_roll);
    }



    public static void main(String []arg){

    CollegeAndStudent Dean = new CollegeAndStudent("Anna University Chennai", "Anna Durai");
    CollegeAndStudent dhoni = new CollegeAndStudent("MS Dhoni", "56576", "ECE");
    CollegeAndStudent pant = new CollegeAndStudent("Pant R", "78787", "CSE");
    CollegeAndStudent rachin = new CollegeAndStudent("Rachin R", "98788", "MECH");

    dhoni.getStudentName();
    pant.getStudentRollNo();

    String name;
    String rollNo;
    String dept;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Student name :: ");
    name = scanner.next();
    System.out.println("Enter the roll num  :: ");
    rollNo = scanner.next();
    System.out.println("Enter the dept  :: ");
    dept = scanner.next();

    CollegeAndStudent sachin = new CollegeAndStudent(name, rollNo, dept);

    sachin.getStudentName();
    sachin.getStudentRollNo();

   //System.out.println(dhoni.student_name);
   System.out.println(dhoni);
   System.out.println(Dean);

    }

    
    
}
