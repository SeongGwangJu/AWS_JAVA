package ch4_입력;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main_백준_2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if(x > 0 && y > 0) {
            System.out.println("1");
            } else if (x < 0 && y > 0 ) {
            System.out.println("2");
            } else if (x < 0 && y < 0 ) {
            System.out.println("3");
            } else {
            System.out.println("4");
            }
    }

}


