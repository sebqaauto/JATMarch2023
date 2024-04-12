package collections;

import java.util.Map.Entry;
import java.util.*;


public class MapTest {
   
     HashMap<Integer, String> hashMap = new HashMap<>();
     HashMap<String, Integer> hashMap2 = new HashMap<>();
 

public void addKeyAndValuesToMap(){
    //HashMap will gurantee any order - insertion order or the sorted order
    hashMap.put(01, "Alpha");
    hashMap.put(03, "Beta");
    hashMap.put(7,"Sun");
    hashMap.put(11, "Jupiter");
    hashMap.put(99, "Pluto");
    hashMap.put(02, "Beta");
    //Duplicate keys cannot be added to the map
    hashMap.put(01, "Alpha");
    hashMap2.put("Monday", 01);
    hashMap2.put("Tuesday", 02);
    hashMap2.put("Wednesday", 03);
    //Duplicate keys cannot be added to the map
    hashMap2.put("Wednesday", 04);

    System.out.println(hashMap.containsKey(99));
    System.out.println(hashMap.containsValue("Pluto"));
}


public void displayMap(){
    for (Entry<Integer, String>  e: hashMap.entrySet()) {
        System.out.println(e.getKey() + " , "+e.getValue());
    }

    for (Entry<String, Integer>  e: hashMap2.entrySet()) {
        System.out.println(e.getKey() + " , "+e.getValue());
    }


}

public static void main(String []args){

    MapTest mapTest = new MapTest();
    mapTest.addKeyAndValuesToMap();
    mapTest.displayMap();
}

    
}
