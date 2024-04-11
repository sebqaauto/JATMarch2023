package genrics;

public class GenericTest <T>{

    T objecT;

    public GenericTest(T objT){
        this.objecT = objT;
    }

    public T getGenericObjectValue(){
        return objecT;
    }

    public static void main(String []args){

        GenericTest<Integer> intType = new GenericTest<Integer>(100);

        GenericTest<Float> floatType = new GenericTest<Float>(98.98f);

        GenericTest<String> stringType = new GenericTest<String>("String for storage");

        System.out.println(intType.getGenericObjectValue());
        System.out.println(floatType.getGenericObjectValue());
        System.out.println(stringType.getGenericObjectValue());
    }
    
}
