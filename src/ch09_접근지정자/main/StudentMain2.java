package ch9_접근지정자.main;

import ch9_접근지정자.Student2;

public class StudentMain2 {
    public static void main(String[] args) {
        Student2 s = new Student2(); //메모리할당, s에 주소를 담아줌
        s.setName("주성광");
        System.out.println(s.getName());
    }
}
