package ch5_조건;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char cmd;

        System.out.println("명령 선택 : ");
        cmd = scanner.next().charAt(0);

        switch (cmd) {
            case 'c': // String이면  " "를 사용, int면 숫자, 문자면 ' '를 사용. create
                System.out.println(" 데이터를 생성합니다.");
                break;

            case 'r': //read
                System.out.println(" 데이터를 조회합니다.");
                break;

            case 'u': //update
                System.out.println(" 데이터를 수정합니다.");
                break;

            case 'd': //delete
                System.out.println(" 데이터를 삭제합니다.");
                break;

            default :
                System.out.println("나머지 처리");
            //CRUD
        }
        /*
        경우에 따라 if보다 깔끔하게 표현가능하다.
        but, 반대로 if보다 가독성이 떨어질 수 있다.
         */
    }
}
