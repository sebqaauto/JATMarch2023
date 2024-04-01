package javaBasics;

public class StringTest2 {

    //String methods

    public static void main(String [] arg){

        String str1 = " Good Morning All ";
        String output;

        System.out.println("The lenght of the str1 "+str1.length());
        System.out.println("The substring of the str1 "+str1.substring(2));
        output = str1.substring(2, 6);
        System.out.println("The subString of the str1 "+output);
        System.out.println("The trimmed  str1 "+str1.trim());
        System.out.println("The replaceed value of the str1 "+str1.replace(" ", ""));
        System.out.println("The charAt value of the str1 "+str1.charAt(4));
        str1 = str1.concat(" Welcome today");
        System.out.println("The Concat value of the str1 ");
        System.out.println("The lenght of the str1 "+str1);


        char []char_arrr = str1.toCharArray();

        for (char c : char_arrr) {
            System.out.print(c+ "");
        }
    }
    
}
