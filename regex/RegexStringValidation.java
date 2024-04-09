package regex;

public class RegexStringValidation {

    public static void main(String []args){
        String str1 = "aaabbbcc";
        String str2 = "cbbb";
        String str3 = "The World is Not Enough - 00700";
        String email = "test12_TEST@test.co.in";


        System.out.println(str1.matches("[abc]*"));
        System.out.println(str2.matches("[abcd]+"));
        System.out.println(str3.replaceAll("-", ""));
        String result = str3.replaceAll("\s", "");
        System.out.println(result);
        int number = Integer.parseInt(str3.replaceAll("\\D",""));

        System.out.println(number);

        System.out.println(email.matches("[a-zA-Z0-9_-]*+@[a-zA-Z]*.([a-z.]{3,5})"));
    }
    
}
