package ch20_컬렉션;

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

    }
}
