package javacollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class List {
    public static void main(String [] args){
        //arraylist
        ArrayList<String> family= new ArrayList<String>();
        family.add("Enver");
        family.add("oghlem");
        family.add("Ezmet");
        family.add("Kudret");

        System.out.println(family.get(2));
        System.out.println(family.set(0, "father"));
        System.out.println(family);

        //HashMap
        HashMap<String, Integer> name=  new HashMap<String, Integer>();
        name.put("Enver", 34);
        name.put("oghlem", 30);
        name.put("Ezmet", 3);
        name.put("Kudret", 2);
        Set<String> keys= name.keySet();
        System.out.println(name);
        System.out.println(keys);



    }
}
