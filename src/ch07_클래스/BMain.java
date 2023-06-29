package ch07_클래스;

public class BMain {
    public static void main(String[] args) {

        B b1 = new B(); //B 자료형의 b1 객체
        b1.test1();
        b1.test2();

        //
        int num1 = b1.test2(); // 왜 출력문도 실행되냐?
        System.out.println(num1);
        System.out.println(b1.test2()); //메소드의 리턴값을 바로 호출해 사용할 수 있다.

        //반환(논리) 메서드 호출 예시
        if(b1.test3()) {
            System.out.println("if문을 실행");
        }

        //매개변수가 있는 메서드 호출
        b1.test4("김준일", 30);
        //오버로딩한 메서드 호출
        b1.test4(30,  "주성광");
    }
}
