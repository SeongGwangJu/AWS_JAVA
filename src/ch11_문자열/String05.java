package ch11_문자열;

import javax.xml.namespace.QName;

public class String05 {
    public static void main(String[] args) {
        String name = "";

        boolean flag = name.isBlank(); //데이터가 비었거나 null이면 true
        System.out.println(flag);
        boolean flag2 = name.isEmpty(); //
        System.out.println(flag2);
    }
}
