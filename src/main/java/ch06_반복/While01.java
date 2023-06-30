package ch06_반복;

import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        /*
        * for vs while
         -순서가 있고, 인덱스(일정 횟수)가 있다 -> for
         -포커스가 조건이다 -> while문을 사용
        */

        Scanner scanner = new Scanner(System.in);
        int selectedNumber = 0;
        boolean flag = true;
        while(flag) {
            System.out.println("[메뉴]");
            System.out.println("1. 1번");
            System.out.println("2. 2번");
            System.out.println("3. 3번");
            System.out.println("4. 4번");
            System.out.println("5. 5번");
            System.out.print("메뉴번호 : ");
            selectedNumber = scanner.nextInt();

            if (selectedNumber == 5) {
                flag = false; //여러 개의 종료가 필요할때 : flag = false 사용

            }   else if(selectedNumber ==1) { //1번메뉴
                char selectedMenu = 0;
                boolean flag2 = true; //flag랑 같이 선언하면 안됨! 생각해보길
                while (flag2) {
                    System.out.println("[1번 메뉴 안쪽]");
                    System.out.println("a. a메뉴");
                    System.out.println("b. b메뉴");
                    System.out.println("c. 뒤로가기");
                    System.out.println("d. 종료");
                    System.out.println("메뉴선택 : ");
                    selectedMenu = scanner.next().charAt(0);

                    if(selectedMenu == 'c') {
                        flag2 = false;
                    } else if (selectedMenu == 'd') {
                        flag2 = false;
                        flag = false;
                    }



                }
                System.out.println("1번 메뉴 종료");
            }

        }
        System.out.println("프로그램 종료");

    }
}

