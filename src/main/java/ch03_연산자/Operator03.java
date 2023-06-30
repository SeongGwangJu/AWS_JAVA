package ch03_연산자;

import java.util.Scanner;

public class Operator03 {
    public static void main(String[] args) {
        /*
        a,b,c 값을 비교해 가장 큰 값을 출력하라.
         */
        int a = 3;
        int b = 4;
        int c = 5;

        //answer(강사님)
        int max;
        max = (a < b) ? b : a;
        max = (max < c) ? c : max;
        System.out.println(max);

        //나
        System.out.println( a < b // 1조건
                ? b < c // 2조건
                ? c  // 2조건 true
                : a //3
                : a < c ? c
                : a );

        //NEW
        System.out.println("\n 아래는 백준 9498 '시험성적' ");

        //내 풀이
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 >> ");
        int score = sc.nextInt();

        System.out.println( (score > 100) ? "100보다 큼"
                : score >= 90 ? "A"    //줄바꿈의 기준은, 연산자 앞에서 ! 그리고 줄바꿈 다음엔 tab 2번!
                : score >= 80 ? "B"    //삼항연산자에서는 각 줄을 평행하게 둔다.
                : score >= 70 ? "C"
                : score >= 60 ? "D"
                : score >= 0 ? "F" : "0보다 작음" );

        //======강사님풀이=======
        System.out.println("\n숫자 입력 >> ");
        score = sc.nextInt();

        String result = (score < 0) || (score > 100) ? "0 미만 or 100 초과"
                : score >= 90 ? "A"
                : score >= 80 ? "B"
                : score >= 70 ? "C"
                : score >= 60 ? "D"
                : "F";

        System.out.println(result);

    }
}
