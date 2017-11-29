package oop.valensi.iFace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringComparable {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Zulu");
        names.add("Eko");
        names.add("Wahyu");
        names.add("Faridi");
        
        for (String name : names) {
            System.out.println("Nama: "+ name);
        }
        
//        String [] sortNames = names.toArray();
//        Arrays.sort(sortNames);
        System.out.println("\n");
        Collections.sort(names);
        for (String name : names) {
            System.out.println("Nama: " + name);
        }
    }
    
}
