package ch05_조건;

public class If02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if (a == 30) {
            System.out.println("a는 30입니다");
        } else {
            if (b == 30) {
                System.out.println("b는 30입니다.");
            } else {
                if (c == 40) {
                    System.out.println("c는 40입니다");
                } else {
                    System.out.println("40이 없습니다");
                }
            }
        }

        //위에거랑 밑에거랑 같은거임. else if의 탄생비화. 쓸데없는 중괄호를 지우면 된다.

        if (a == 30) {
            System.out.println("a는 30입니다");
        } else if (b == 30) {
            System.out.println("b는 30입니다.");
        } else if (c == 40) {
            System.out.println("c는 40입니다");
        } else {
            System.out.println("40이 없습니다");
        }
    }
}
