package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest2 {

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();

    public void addLists(){
        for(int i =0; i<12000000; i++){
            arrayList.add(i, i);
            linkedList.add(i, i);
        }
    }

    /*
     * get() from middle - ArrayList is fast
     * get() from the first and last - Both are same
     * add() from the first & middle - LinkedList is fast
     * add() from the last - Both are same
     * set() from first and last - Both are same
     * set() from the middle - ArrayList is fast
     * remove() from the first and middle - LinkedList is fast
     * remove() from the last - both are same
     */

    public static void main(String []args){
        ListTest2 listObject = new ListTest2();
        listObject.addLists();
        listObject.retreiveDataFromList();
        listObject.insertToList();
        listObject.updateList();
        listObject.removeFromList();
    }

    //Retreival from the List
    public void retreiveDataFromList(){
        //Retreiveing data from the first position or the start of the list 
        long startingTime;
        startingTime = System.currentTimeMillis();
        arrayList.get(0);
        System.out.println("Time Taken by the ArrayList to retreive from the beginning "+(System.currentTimeMillis()-startingTime));

        startingTime = System.currentTimeMillis();
        linkedList.get(0);
        System.out.println("Time Taken by the LinkedList to retreive from the beginning "+(System.currentTimeMillis()-startingTime));
   
        //Retreiveing data from the middle position  of the list 
        startingTime = System.currentTimeMillis();
        arrayList.get(arrayList.size()/2);
        System.out.println("Time Taken by the ArrayList to retreive from the Middle "+(System.currentTimeMillis()-startingTime));
        startingTime = System.currentTimeMillis();
        linkedList.get(linkedList.size()/2);
        System.out.println("Time Taken by the Linked List to retreive from the Middle "+(System.currentTimeMillis()-startingTime));

        //Retreiveing data from the end position  of the list 
        startingTime = System.currentTimeMillis();
        arrayList.get(arrayList.size()-10);
        System.out.println("Time Taken by the ArrayList to retreive from the End "+(System.currentTimeMillis()-startingTime));
        startingTime = System.currentTimeMillis();
        linkedList.get(linkedList.size()-10);
        System.out.println("Time Taken by the Linked List to retreive from the End "+(System.currentTimeMillis()-startingTime));
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");

    }   

    //Insertion into the list
    public void insertToList(){
        //insertion at the beginning of the List
        long startingTime;
        startingTime = System.currentTimeMillis();
        arrayList.add(0, 1);
        System.out.println("Time Taken by the ArrayList to Add from the beginning "+(System.currentTimeMillis()-startingTime));

        startingTime = System.currentTimeMillis();
        linkedList.add(0, 1);
        System.out.println("Time Taken by the LinkedList to Add from the beginning "+(System.currentTimeMillis()-startingTime));

        //insertion at the Middle of the List

        startingTime = System.currentTimeMillis();
        arrayList.add((arrayList.size()/2), 1);
        System.out.println("Time Taken by the ArrayList to Add to the Middle "+(System.currentTimeMillis()-startingTime));

        startingTime = System.currentTimeMillis();
        linkedList.add((linkedList.size()/2), 1);
        System.out.println("Time Taken by the LinkedList to Add to the Middle "+(System.currentTimeMillis()-startingTime));

        //insertion at the End of the List
        startingTime = System.currentTimeMillis();
        arrayList.add((arrayList.size()), 1);
        System.out.println("Time Taken by the ArrayList to Add to the End "+(System.currentTimeMillis()-startingTime));

        startingTime = System.currentTimeMillis();
        linkedList.add((linkedList.size()), 1);
        System.out.println("Time Taken by the LinkedList to Add to the End "+(System.currentTimeMillis()-startingTime));
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");

    }

    //Updation  into the list
public void updateList(){
    //Update at the beginning of the List
    long startingTime;
    startingTime = System.currentTimeMillis();
    arrayList.set(0, 1);
    System.out.println("Time Taken by the ArrayList to Update from the beginning "+(System.currentTimeMillis()-startingTime));
    startingTime = System.currentTimeMillis();
    linkedList.set(0, 1);
    System.out.println("Time Taken by the LinkedList to Update from the beginning "+(System.currentTimeMillis()-startingTime));
    //Update at the Middle of the List
    startingTime = System.currentTimeMillis();
    arrayList.set((arrayList.size()/2), 1);
    System.out.println("Time Taken by the ArrayList to Update to the Middle "+(System.currentTimeMillis()-startingTime));
    startingTime = System.currentTimeMillis();
    linkedList.set((linkedList.size()/2), 1);
    System.out.println("Time Taken by the LinkedList to Update to the Middle "+(System.currentTimeMillis()-startingTime));
    //Update at the End of the List
    startingTime = System.currentTimeMillis();
    arrayList.set((arrayList.size()-1), 1);
    System.out.println("Time Taken by the ArrayList to Update to the End "+(System.currentTimeMillis()-startingTime));
    startingTime = System.currentTimeMillis();
    linkedList.set((linkedList.size()-1), 1);
    System.out.println("Time Taken by the LinkedList to Update to the End "+(System.currentTimeMillis()-startingTime));
    System.out.println("-----------------------------");
    System.out.println("-----------------------------");

}

 //Removal from the list
 public void removeFromList(){
    //Remove at the beginning of the List
    long startingTime;
    startingTime = System.currentTimeMillis();
    arrayList.remove( 1);
    System.out.println("Time Taken by the ArrayList to Remove from the beginning "+(System.currentTimeMillis()-startingTime));
    startingTime = System.currentTimeMillis();
    linkedList.remove( 1);
    System.out.println("Time Taken by the LinkedList to Remove from the beginning "+(System.currentTimeMillis()-startingTime));
    //Update at the Middle of the List
    startingTime = System.currentTimeMillis();
    arrayList.remove((arrayList.size()/2));
    System.out.println("Time Taken by the ArrayList to Remove to the Middle "+(System.currentTimeMillis()-startingTime));
    startingTime = System.currentTimeMillis();
    linkedList.remove((linkedList.size()/2));
    System.out.println("Time Taken by the LinkedList to Remove to the Middle "+(System.currentTimeMillis()-startingTime));
    //Update at the End of the List
    startingTime = System.currentTimeMillis();
    arrayList.remove((arrayList.size()-1));
    System.out.println("Time Taken by the ArrayList to Remove to the End "+(System.currentTimeMillis()-startingTime));
    startingTime = System.currentTimeMillis();
    linkedList.remove((linkedList.size()-1));
    System.out.println("Time Taken by the LinkedList to Remove to the End "+(System.currentTimeMillis()-startingTime));
    System.out.println("-----------------------------");
    System.out.println("-----------------------------");
 }

}
