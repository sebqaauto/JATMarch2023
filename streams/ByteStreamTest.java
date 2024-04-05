package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest {

    public static void main(String [] args){

        FileInputStream fileInputStream;

        FileOutputStream fileOutputStream;

        String texString = "Hi I'm writing this down from a java program on to a file that is in my machine";
        byte[] stringToBytes = texString.getBytes();
        for (byte b : stringToBytes) {
            //System.out.println(b);
        }
        try {
            //Creating the instance for the fileoutStream and assinging the path/location where to write
            fileOutputStream = new FileOutputStream("/Users/Sebastian/Desktop/JATMarch2023/streams/ByteStreamFile.txt");
            //Wrting the in to file as byte streams
            fileOutputStream.write(stringToBytes);
            //closing the fileOutputStream instance
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        } catch (IOException e) {
    
            e.printStackTrace();
        }

        try {
             //Creating the instance for the fileInputStream and assinging the path/location where to read data from
            fileInputStream = new FileInputStream("/Users/Sebastian/Desktop/JATMarch2023/streams/ByteStreamFile.txt");
            //Creating a byte[] to store the bytes which are read from the file and size for the byte arry is given by available() 
            byte[] byteArary = new byte[fileInputStream.available()];
            //Reading the byte stream and copying it to the byte array
            fileInputStream.read(byteArary);
            
            int size = fileInputStream.available();
            System.out.println("the number fo Bytes in the file "+size);
            int ascci_value;
            while((ascci_value=fileInputStream.read())!=-1 ){
                System.out.print((char)ascci_value);
             }
         
            fileInputStream.close();

            //Prinitng the contents of the byte []
            for (byte b : byteArary) {
                System.out.print(b);
            }
            System.out.println(" ");

            //Converting the byte to char and printing them
            for (byte b : byteArary) {
                System.out.print((char)b);
            }
            //Converting the byte array to String 
            String result = new String(byteArary);

            System.out.println(result);

        } catch (FileNotFoundException e) {
         
            e.printStackTrace();
        } catch (IOException e) {
           
            e.printStackTrace();
        }

    }
    
}
