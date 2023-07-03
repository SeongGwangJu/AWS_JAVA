package ch18_빌더;

public class UserTest {

    public static  void printUser() { // static -> 생성 안해도 클래스 이름으로 직접호출 가능

        System.out.println("사용자 정보 출력");
        (new UserTest()).test(); //UserTest 클래스의 인스턴스 생성 -> test()메서드 호출

        // new UserTestTest(); //생성이 안된다.
        // (new UserTest()).new UserTestTest();

        new UserTestTest(); //UserTestTest 클래스의 인스턴스 생성
        new UserTest.UserTestTest(); //==위와 같음. 정적 내부 클래스의 인스턴스 생성

    }

    public void test() { //생성해야 쓸수 있는 인스턴스 메소드,
        System.out.println("테스트 메소드 호출");
    }

    //정적 내부클래스
    public static class UserTestTest { //생성 없이 쓰기위해 static을 부여.

        //인스턴스 메서드
        // UserTestTest 클래스의 인스턴스를 생성한 후 해당 객체의 인스턴스를 통해 호출할 수 있다.
        public void  testTest() {
            System.out.println("테스트테스트 메소드 호출");
        }
    }
}
