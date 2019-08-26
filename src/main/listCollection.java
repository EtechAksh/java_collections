package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 */
public class listCollection {
    //List listCollection = new List();


    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Etechfactory");
        arrayList.add("ABC");
        arrayList.add("XYZ");
        arrayList.add("ABC");

        System.out.println(arrayList);


        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("\n");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n");
        arrayList.remove(1);
        System.out.println(arrayList);

        arrayList.remove("XYZ");
        System.out.println(arrayList);

        System.out.println("Does this contain XYZ: " + arrayList.contains("XYZ"));


        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Etechfactory");
        arrayList2.add("ABC");
        arrayList2.add("XYZ");
        arrayList2.add("ABC");

        arrayList.addAll(arrayList2);

        System.out.println(arrayList);


        System.out.println(arrayList.equals(arrayList2));

        System.out.println(arrayList.indexOf("ABC"));
        System.out.println(arrayList.lastIndexOf("ABC"));


        System.out.println("\n");
        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println("\n");
        Collections.reverse(arrayList);
        System.out.println(arrayList);


        System.out.println("\n" + arrayList2);
        Collections.sort(arrayList2, Collections.reverseOrder());
        System.out.println(arrayList2);


    }
}


