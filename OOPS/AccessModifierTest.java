package OOPS;

public class AccessModifierTest {

    //Class Variables - they don't need the help of the Instances of class(Object)
    private static String privStringStat = "This is a private static String";
    static String  defaulStringStat = "This is a default static String";
    protected static String proStringStat = "This is a protected static String ";
    public static String pubStringStat = "this is a public static String";

    //Instance Variables
    private String privStringInst = "This is a private instance String";
    String defaulStringInst = "This is a default instance String";
    protected  String proStringInst = "This is a protected instance String ";
    public  String pubStringist = "this is a public instance String";


     public void getInstanceVariableDetails(){
        System.out.println(privStringStat);
        System.out.println(defaulStringStat);
        System.out.println(proStringStat);
        System.out.println(pubStringStat);

    }

    public static void main(String [] tue){

        //Static can be called inside the static and non-static 
        System.out.println(privStringStat);
        System.out.println(defaulStringStat);
        System.out.println(proStringStat);
        System.out.println(pubStringStat);

        AccessModifierTest aModifierTest = new AccessModifierTest();

        System.out.println(aModifierTest.privStringInst);
        System.out.println(aModifierTest.defaulStringInst);
        System.out.println(aModifierTest.proStringInst);
        System.out.println(aModifierTest.pubStringist);
        aModifierTest.pubStringist = "I'm from the object of the parent class";

    }
    
}
