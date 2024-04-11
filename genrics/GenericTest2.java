package genrics;

public class GenericTest2 <T, U, V>{

    T objecT;
    U objectU;
    V objectV;

    public GenericTest2(T objT, U objU, V objV){
        this.objecT = objT;
        this.objectU = objU;
        this.objectV = objV;
    }

    public T getGenericObjectValue(){
        return objecT;
    }

    public static void main(String []args){

        GenericTest2<Integer, Double, String> intType = new GenericTest2<Integer, Double, String >(100, 99.989d, "Hi from Genric2");

        GenericTest2<Float, String, Character> floatType = new GenericTest2<>(100.10f, "Hi from Genric2", 'F');

    
        System.out.println(intType.objecT + " " +intType.objectU+ " "+intType.objectV);
    
    
    }
    
}























