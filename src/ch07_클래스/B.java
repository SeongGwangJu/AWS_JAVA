package ch07_클래스;

public class B {

    //반환 x 매개변수x
    void test1() { //void : 반환이 없다
        System.out.println("test1 메소드 호출");
    }

    //반환(정수) 매개변수x
    int test2() {
        System.out.println("test2 메소드 호출");
        return 100;
    }

    //반환(논리) 매개변수x
    boolean test3() {
        System.out.println("test3 메소드 서비스를 실행합니다.");
        return test2() == 100;
    }

    //반환x 매개변수o
    void test4(String name, int age) {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }

    // 매개변수의 형태가 같기 때문에, 위와 같은 test4 메서드 명으로는 만들 수 없다.
    /* void test4(String name, int score) {
        System.out.println("나의 이름 : " + name);
        System.out.println("나의 점수 : "+ score);
    } */

    //매개변수의 형태를 다르게 하면 같은 메서드명을 쓸 수 있다.
    //이걸 '오버로딩'이라고 부른다.
    void test4(int age, String name) {
        System.out.println("나의 이름 : " + name);
        System.out.println("나의 나이 : " + age);
    }

    // 리턴값을 주거나(!void), 자료형을 바꾸면 오버로딩이 될까? => 안된다.
    /* int test4(String name, int age) {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        return 100;
    } */

}
