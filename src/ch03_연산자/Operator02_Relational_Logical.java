package ch3_연산자_0626;

import java.util.Scanner;

public class Operator02_Relational_Logical {
    public static void main(String[] args) {
        /*
        *논리연산자
        *1. && -> and(그리고)   -곱
          true && false => false (= 1 * 0 = 0)
        *2. || -> or(또는)     -합
          true || false => true (= 1 + 0 = 1)
        *3. ! -> not(부정)     -반전
          !(true || false) => false ( !1)
        */

        final int MAX = 100; //상수, constant
        final int MIN = 0;
        int num = -10;
        System.out.println(MAX < num); /* 관계연산자는 true or false 를 반환한다. */

        //System.out.println(MIN < num < MAX); 를 표현하고 싶다면
        System.out.println((MIN < num) && (MAX < num));
        // '||' : or, 한쪽의 연산이 true -> true 반환,
        // '&&' : and, 둘 다 충족해야 true 반환


        System.out.println("\n 아래는 백준 2753번");

        //(1)==========================
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력1 >> ");
        int year = scanner.nextInt();
        if(((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        //(2)===================
        System.out.println("입력3 >> ");
        year = scanner.nextInt();
        System.out.println((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ? 1 : 0);

        System.out.println("입력4 >> ");
        year = scanner.nextInt();
        System.out.println((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ? 1 : 0);

        //(3)======================
        System.out.println("입력5 >> ");
        year = scanner.nextInt();
        boolean result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(result);

        System.out.println("입력6 >> ");
        year = scanner.nextInt();
        String result2 = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ? "1" : "0";
        System.out.println(result2);
    }
}
