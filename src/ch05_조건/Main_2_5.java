package ch05_조건;

import java.util.Scanner;
public class Main_2_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 : ");
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        if(m >= 45) {
            m = m - 45;

        } else if (h >= 1) {
            h = h - 1;
            m = m + 60 - 45;

        } else {
            h = 24 - 1;
            m = m + 60 - 45;
        }

        System.out.printf("%s %s", h, m );
    }
}


