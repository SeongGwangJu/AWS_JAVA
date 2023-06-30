package ch15_오브젝트;

import java.util.Scanner;

public class ScannerString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = "aaa";
        String password = "1234";
        String inputUsername = null;
        String inputPassword = null;

        System.out.print("아이디 : ");
        inputPassword = scanner.nextLine();
        System.out.print("비밀번호 : ");
        inputPassword = scanner.nextLine();
        //Scanner의 동작 : new String -> 위의 "aaa" 라는 리터럴과 다른값이다.
        System.out.println("inputUsername = " + inputUsername);
        System.out.println("inputPassword = " + inputPassword);

        if(username != inputUsername) { //주소비교 -> 바르게 입력해도 안된다.
            System.out.println("(주소비교) 아이디가 일치하지 않습니다");
            return;
        }

        //문자열을 비교할때는
        if(!username.equals(inputUsername)) {
            System.out.println("아이디가 일치하지 않습니다");
            return;
        }

        if (!password.equals(inputPassword)) {
            System.out.println("비밀번호가 일치하지 않습니다");
            return;
        }
        System.out.println("로그인 성공");

    }
}
