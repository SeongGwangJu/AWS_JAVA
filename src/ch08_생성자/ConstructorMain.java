package ch8_생성자;

public class ConstructorMain {
    public static void main(String[] args) {
        //메서드 호출 : 메모리에 Constructor01 주소를 할당해줌.
        new Constructor01();
        Constructor01 constructor01 = new Constructor01();

        System.out.println(constructor01);

    }
    /*
    메서드는 메서드 호출 후 실행될거 다되고 리턴값이 반환됨
    그러나, 생성자는 반환이 없어서, 주소만 리턴한다.
    => 메서드처럼 int니 Stirng이니 자료형을 적어줄 필요가 없다.

     */
}
