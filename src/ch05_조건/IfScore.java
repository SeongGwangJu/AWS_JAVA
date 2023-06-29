package ch05_조건;

import java.util.Scanner;

public class IfScore {
    public static void main(String[] args) {
        int score;
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 : ");
        score = scanner.nextInt();

        if(score >100 || score <0) {
            result = "X"; //중괄호가 닫히기 전에 엔터를 쳐준다

        } else if (score >= 90) {
            result = "A";

        } else if (score >= 80) {
            result = "B";

        } else if (score >= 70) {
            result = "C";

        } else if (score >= 60) {
            result = "D";

        } else {
            result ="F";

        }
        System.out.println(result);
    }
}
