package ch18_빌더;

import ch18_빌더.KoreaUser;

public class KoreaUserMain {
    public static void main(String[] args) {


    /*KoreaUser koreaUser = new KoreaUser(1, "aaa",
            "1234", "김준일", "aaa@gmail.com"); //원래 쓰던 이 방식이 아니라!!!
    */

        KoreaUser koreaUser = KoreaUser.Builder()
                .userId(1)
                .username("aaa")
                .password("1234")
                .name("주성광")
                .email("aaa@gmail.com")
                .build();

        /*
        KoreaUser koreaUser = KoreaUser.builder().userId(1).build();

         */
        KoreaUser koreaUser2 = new KoreaUser();
    /*객체를 생성할 때 부터 세터처럼 넣고싶은거만 넣고싶다.
        =>빌더클래스에서 빌더라는 메서드(스태틱)를 만든다.
     */

        System.out.println(koreaUser.getUserId());
        System.out.println(koreaUser.getUsername());
        System.out.println(koreaUser.getPassword());
        System.out.println(koreaUser.getUsername());
        System.out.println(koreaUser.getEmail());
        System.out.println(koreaUser.getName());
    }
}
