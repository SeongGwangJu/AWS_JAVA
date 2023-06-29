package ch04_입력;

import java.util.Scanner;

public class Input01 {
    public static void main(String[] args) {
        //next();
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력1 : ");
        String input1 = scanner.next(); //입력값 받음, 띄어쓰기 포함 x
        System.out.println("출력1 : " + input1);

        System.out.print("입력2 : ");
        String input2 = scanner.next(); //입력값 받음.
        System.out.println("출력2 : " + input2);


        //newtLine();
        System.out.println("입력3 : ");
        String input3 = scanner.nextLine(); //입력값 받음, 띄어쓰기 포함 O
        System.out.println("출력3 : " + input1);

        System.out.print("입력4 : ");
        String input4 = scanner.nextLine();
        System.out.println("출력4 : " + input2);

        System.out.println("입력완료.");
    }
}
