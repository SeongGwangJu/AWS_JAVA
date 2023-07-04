package ch22_익명클래스;

public class AuthorityMain {
    public static void main(String[] args) {
        GrantiedAuthorities authorities = new GrantiedAuthorities() {

            @Override
            public String getAuthority() {
                System.out.println("권한출력");
                return "ROLE_USER";
            }
        };
//14,16,17 에러발생 -> 주석처리
//        System.out.println(authorities.getAuthorities);

//        A a = new A();
//        /System.out.println(a.getAuthortity);
    }
}
/*
class A implements GrantiedAuthorities {

        @Override
    public String getAuthortity; {
        System.out.println("두번째 권한 출력");
        return "ROLE_ADMIN";
    }



}
*/
