package ch5_조건;

import java.util.Scanner;

public class Main_2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a > b) {
            System.out.println(">");
        } else if (a < b ) {
            System.out.println("<");
        } else System.out.println( "==");
    }
}


