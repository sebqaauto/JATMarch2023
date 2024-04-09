package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidation {

    public static void main(String []args){

        String text ="election commission has announced election date";

        //Regex using Pattern and Matcher Class
        Pattern pattern = Pattern.compile("election");

        Matcher matcher = pattern.matcher(text);

       System.out.println("Did it find the match "+matcher.find());
    }
    
}
