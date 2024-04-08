package exceptions;

public class ArthimeticTest {

    static void divide(){
        try {
            int result = 5/0;
            System.out.println(result);   
        } catch (Exception e) {
            System.out.println("Printing the stack trace");
          System.out.println(e.getStackTrace()) ;
           System.out.println(e.getClass());
           System.out.println(e.getMessage());
        }

         System.out.println("From the divide method after the method call");
       
    }

    static void divide2(int a, int b) throws ArithmeticException{

        int[] array_int = new int[] {1,2,3};
        array_int[3] = 6;
        String str = "CSK";
        System.out.println(str.charAt(3));
        int result = a/b;
        System.out.println(result);   
       
    }

    public static void main(String []args) {
        divide();
        try {
            divide2(5,0);
        } catch(ArithmeticException e) {
          System.out.println("From the Arthimetic exception Block");
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("From the StringIndexOutOfBoundsException Block");
            System.out.println(e.getClass());
        }catch(Exception e){
            System.out.println("From the exception Block");
            System.out.println(e.getClass());
            System.out.println(e.getMessage());

        }
         
      
        System.out.println("From the main method after the method call");              
      
    }
    
}
