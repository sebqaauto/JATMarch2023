package OOPS;

public class AccessTestSamePackage {

    public static void main(String [] tue){
        //Static can be called inside the static and non-static 
        //System.out.println(privStringStat);
        //System.out.println(defaulStringStat);
        //System.out.println(proStringStat);
        //System.out.println(pubStringStat);
        AccessModifierTest aModifierTest = new AccessModifierTest();
        //System.out.println(aModifierTest.privStringInst);
        System.out.println(aModifierTest.defaulStringInst);
        System.out.println(aModifierTest.proStringInst);
        System.out.println(aModifierTest.pubStringist);

        aModifierTest.getInstanceVariableDetails();
    }
    
}
