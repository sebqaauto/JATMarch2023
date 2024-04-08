package exceptions;

public class StackOverflowTest {


    public static int callItself(int i){
        if(i == 0){
            return i;
        }else{
            //recursive call - infinite number of times
            callItself(++i);
        }
     return i;
    }
    public static void main(String []arg){

        // java.lang.StackOverflowError as the stack memory of the program is subjected to overflow due to continuos recurrise calls
        callItself(5);

    }
    
}
