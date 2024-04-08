package streams;

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Student implements Serializable{

    public int rollno;
    public String stud_Name;
    public String dept;

    Student(){

    }

    Student(int roll, String name, String dept){
        this.rollno = roll;
        this.stud_Name = name;
        this.dept = dept;
    }

}

public class SerializationTest {

    public static void main(String []args) throws FileNotFoundException, IOException{

        //Write the Object in to a file
        FileOutputStream fos = new FileOutputStream("/Users/Sebastian/Desktop/JATMarch2023/streams/ObjectByteStreamFile.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
        Student dhoni = new Student(07, "MS Dhoni", "Wkt keeper");
        objectOutputStream.writeObject(dhoni);
        objectOutputStream.close();
        fos.close();
    }
    
}
