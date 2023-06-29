package ch04_입력;

import java.util.Scanner;

public class Input02 {
    /*
    이름 :
    나이 :
    연락처 :
    주소 :
    성별 :

    고객님의 이름은
     */
    public static void main(String[] args) {
        //변수 선언 first
        String name = null;
        int age = 0;
        String phone = null;
        String address = null;
        String gender = null;

        //입력
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 : ");
        name = scanner.nextLine();
        System.out.print("나이 : ");
        age = scanner.nextInt(); //next**()은 엔터와 스페이스를 무시함(버퍼)
        scanner.nextLine(); //nextLine()만 엔터
        System.out.print("연락처 : ");
        phone = scanner.next();
        scanner.nextLine();
        System.out.print("주소 : ");
        address = scanner.nextLine();
        System.out.print("성별 : ");
        gender = scanner.next();

        //출력
        System.out.println();
        System.out.println("고객님의 이름은 " + name + "이고 나이는 " + age +"세입니다. \n" +
                "연락처는 " + phone + "이며 주소는 " + address + "입니다.\n성별은 "+ gender +"입니다.");

        //버퍼 개념 review!!!!!

    }
}
