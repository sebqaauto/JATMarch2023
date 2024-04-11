package collections;

import java.util.ArrayList;

public class ListTest {

   //Collection represents a single object which in turn refers/holds multiple objects
    ArrayList<Integer> arrayList = new ArrayList<>();
     //ArrayList's size can grow dynamically 
    ArrayList<Integer> arrayList2 = new ArrayList<>();
   

    ArrayList<String> arrayStringList = new ArrayList<>();

    public void addElementstoArray(){
        arrayList2.add(99);
        arrayList2.add(999);
        arrayList2.add(99999);

        for(int i=0; i<=22; i++){
            arrayList.add(i);
        }
        arrayList.addAll(arrayList2);
        arrayList.remove(0);
    }

    public void displayArray(){
        for (Integer iterable_element : arrayList) {
                System.out.println(iterable_element);
        }
        System.out.println("The Size of the Array is "+arrayList.size());
        System.out.println("The element at the last index is "+arrayList.get(arrayList.size()-1));

    }



    public void addStringtoArray(){
        arrayStringList.add("ForeNoon");
        
    }

    public static void main(String []args){

        ListTest object = new ListTest();
        object.addElementstoArray();
        object.displayArray();

    }
    
}
