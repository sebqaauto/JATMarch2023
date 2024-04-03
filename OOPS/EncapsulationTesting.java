package OOPS;

public class EncapsulationTesting {

    public static void main(String []args){

        EncapusaltionTest test = new EncapusaltionTest();
        test.setName("Private memeber");
        System.out.println(test.getName());
        String result = test.getName();

        System.out.println(result);

    }
    
}
