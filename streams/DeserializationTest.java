package streams;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationTest {

    public static void main(String []arg) throws IOException, ClassNotFoundException{
        
        //Read the Object

        //Access the File
        FileInputStream fis = new FileInputStream("/Users/Sebastian/Desktop/JATMarch2023/streams/ObjectByteStreamFile.txt");

        //Objec Stream to read the Object
        ObjectInputStream ObjectInputStream = new ObjectInputStream(fis);

        Student dhoni2 = (Student)ObjectInputStream.readObject();
        ObjectInputStream.close();
        System.out.println(dhoni2.stud_Name+ " "+ dhoni2.rollno+ " "+dhoni2.dept);

    }
    
}
