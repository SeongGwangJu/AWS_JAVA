package ch20_컬렉션;

import java.util.ArrayList;
import java.util.LinkedList;

public class StringArrayListMain {

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add(1, "f");
        System.out.println(list);

        System.out.println(list.remove() + "를 지웁니다.");
        System.out.println(list);

        System.out.println(list.remove(3) + "를 지웁니다.");
        System.out.println(list);

        list.set(1, "set메서드");
        System.out.println(list);

        System.out.println("=========ArrayList==============");
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("a");
        arraylist.add("b");
        arraylist.add("c");
        arraylist.add("d");
        arraylist.add("e");

        System.out.println(arraylist);
        System.out.println(arraylist.remove(3));
        System.out.println(arraylist);
        arraylist.set(0 , "h");
        System.out.println("===");
        System.out.println(arraylist);

        //arraylist.addAll('가');
        /*
        *중요한거
        *add
        contains
        forEach
        get
        indexOf
        lastindexOf
        remove

         */
    }
}


