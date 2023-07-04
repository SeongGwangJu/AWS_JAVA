package ch19_제네릭;

public class ResponseMain2 {
    public static void main(String[] args) {

        // 제네릭을 사용하면 일반적인 타입 대신 실제 사용될 타입을 지정할 수 있다.
        // 다양한 타입의 데이터를 처리하는 유연한 구조를 만들 수 있다. 재사용성을 높일 수 있다.

        // String을 사용하는 예
        Response<String> response = new Response<String>(200, "회원가입 성공!!");
        System.out.println(response);

        SignupUser signupUser = SignupUser.builder()
                .username("aaa")
                .password("1234")
                .name("주성광")
                .email("aaa@gmail.com")
                .build();

        // SignupUser를 사용하는 예
        Response<SignupUser> response2 = new Response<SignupUser>(400, signupUser);
        System.out.println(response2);

        AccountUser accountUser = AccountUser.builder()
                .username("AAA")
                .password("4321")
                .build();

        // 와일드카드(<?>)를 사용한 예
        Response<AccountUser> response3 = new Response<AccountUser>(200 , accountUser);

        UpdateUser updateUser = UpdateUser.builder()
                .username("aaa")
                .password("1234")
                .address("부산")
                .phone("010-0000-0000")
                .build();

        Response<UpdateUser> response4 = new Response<UpdateUser>(300, updateUser);

        System.out.println("printResponse3");
        System.out.println(response3);
        printResponse(response3);

        System.out.println("printResponse4");
        System.out.println(response4);

        printResponse(response4);

    }

    public static Response<?> printResponse(Response<? extends AccountUser> response) {
        System.out.println(response);
        return response;
    }
}
