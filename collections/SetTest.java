package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetTest {

    //Set cannot have duplicates
    TreeSet<String> treeSet = new TreeSet<>();
    HashSet<String> hashSet = new HashSet<>();

    public void addSet(){
        treeSet.add("Zebra");
        treeSet.add("Xylo");
        treeSet.add("Camel");
        treeSet.add("Alpha");
        treeSet.add("Beta");
        treeSet.add("Beta");

        hashSet.add("Zebra");
        hashSet.add("Xylo");
        hashSet.add("Camel");
        hashSet.add("Alpha");
        hashSet.add("Beta");
        hashSet.add("Alpha");
        
    }

    public void displaySet(){

        System.out.println(treeSet.containsAll(hashSet));

        System.out.println("Printing Hashset Values --- ");
        for (String string : hashSet) {
            System.out.println(string);
        }

        System.out.println("Printing TreeSet Values --- ");
        for (String string : treeSet) {
            System.out.println(string);
        }
    }

    public static void main(String []args){

        SetTest setTest = new SetTest();
        setTest.addSet();
        setTest.displaySet();
    }


    
}
