package streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamTest {

    public static void main(String [] args) throws IOException, FileNotFoundException{

        FileReader fileReader;
        FileWriter fileWriter;

        String textToWrite = "Good Morning this is a wake up call from the Character Stream Class";

        fileWriter = new FileWriter("/Users/Sebastian/Desktop/JATMarch2023/streams/CharacterStreamFile.txt");

        fileWriter.write(textToWrite);

        fileWriter.close();


        fileReader = new FileReader("/Users/Sebastian/Desktop/JATMarch2023/streams/CharacterStreamFile.txt");

        int ascci_value;
         while((ascci_value=fileReader.read())!=-1 ){
        System.out.print((char)ascci_value);
       }
     
       fileReader.close();

    }
    
}
