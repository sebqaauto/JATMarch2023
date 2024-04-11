package genrics;

public class ObjectTest {

    public static void main(String []args){

        Object []object = new Object[3];
        object[0] = "Dhoni";
        object[1] = "wkt";
        object[2] = 44.45f;

        for (Object object2 : object) {
            System.out.println(object2);
        }

        String str;
        str = (String) object[0];
        System.out.println(str);
        str = (String)object[1];
        System.out.println(str);
        //At Run time it throws exception and type safety is not considered
        str = (String)object[2];
        System.out.println(str);



    }
    
}
