package ch07_클래스;

public class A {
    /*
    클래스에는 변수와 함수(=메소드)를 담을 수 있다.
     */

    //변수 담기
    int num1; //객체
    int num2;

    //함수 담기(클래스 안에 담은 함수 = '메소드'라 부름)

    void test1() { //입력이 없는 함수
        System.out.println("테스트1 함수 호출");
    }

    void test2(int x, int y) { //입력이 있는 함수
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    void test3() {
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    void test10(String str10) {
        System.out.println(str10 + "을 만듭니다");
    }
}

/*
참고 : 정적메모리 : stack
        동적메모리 : heap
        동적할당
        정적할당..
 */