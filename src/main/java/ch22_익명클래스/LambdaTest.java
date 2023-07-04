package ch22_익명클래스;

import java.util.Arrays;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        GrantedAuthorities authorities2 = new GrantedAuthorities() {

            @Override
            public String getAuthority() {
                System.out.println("권한 출력");
                return "ROLE_USER";
            }
        };
//람다를 쓰기위해선 딱 하나의 추상클래스만 선언 되어야함.

        GrantedAuthorities authorities = () -> "ROLE_USER";

        System.out.println(authorities.getAuthority());

        Integer[] test = {1,2,3,4,5,6,7,8,9,10};

        Arrays.asList(test).forEach(num ->
            System.out.println(num));
        //Consumer안에 들어있는 Except메서드);
        // 람다식 : 매개변수의 자료형을 생략할 수 있다.


    }
}
