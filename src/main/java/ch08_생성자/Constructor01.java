package ch08_생성자;

public class Constructor01 {
        //클래스 명 외에는 모두 소문자로 시작한다고 했는데, 생성자는 다르다!
        /*
        생성자의 특징
         - 반환 자료형이 없다.(정확히는, 명시되지 않는다)
         - 클래스명과 동일한 이름을 사용한다.
         - 메소드처럼 오버로딩이 가능하다.
         */

        Constructor01() {
            System.out.println("생성자 호출");
        }


}
