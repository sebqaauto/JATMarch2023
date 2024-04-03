package javaBasics;

import OOPS.AccessModifierTest;

public class AccessTestOutsidePacakage2 {
    
     public static void main(String [] tue){
     //Static can be called inside the static and non-static 
    // System.out.println(privStringStat);
     //System.out.println(defaulStringStat);
     //System.out.println(proStringStat);
     //System.out.println(pubStringStat);
     AccessModifierTest aModifierTest = new AccessModifierTest();
     //AccessTestOutsidePackage aOutsidePackage = new AccessTestOutsidePackage();
     //System.out.println(aOutsidePackage.privStringInst);
    // System.out.println(aOutsidePackage.defaulStringInst);
     //System.out.println(aOutsidePackage.proStringInst);
     System.out.println(aModifierTest.pubStringist);
     aModifierTest.getInstanceVariableDetails();
 }
     
 
}
