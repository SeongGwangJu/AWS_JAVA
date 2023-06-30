package ch07_클래스;

public class AMain {
    public static void main(String[] args) {
        //클래스 생성예제
        A a = new A(); //생성 ->인스턴스 생성, 동적메모리 할당.
        System.out.println(a); // a의 주소값을 출력
        System.out.println(a.num1);

        a.num1 = 10;
        System.out.println(a.num1);
        a.num2 = 20;
        System.out.println(a.num2);

        A a2 = new A(); // a2라는 주소변수로, 생성.
        System.out.println(a2);
        a2.num1 = 100;
        System.out.println(a.num1 + a2.num1); //num1이라는 변수를 똑같이 사용할 수 있다. 왜? num1은 a와 a2의 지역변수.

        //===========================
        //메소드 호출예제
        a.test1();
        a.test2(1, 2);
        a.test3();
        a2.test3(); //a와 a2에 들어있는 num1과 num2는 다름을 알 수 있음. 다른 주소 안에 메서드를 가지고있다.


        a.test10("\n 슈붕");
    }
}
