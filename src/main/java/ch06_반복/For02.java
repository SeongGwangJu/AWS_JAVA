package ch06_반복;

public class For02 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        //int num = 10;   //재선언 불가

        /*
        Q.왜 for 안의 i는 여러번 자료형을 선언해줘도 상관없는가? 왜 여러번 자료형을 적어줘야하나?
        => A. i는 지역변수로, 선언된 for문 안에서만 사용되기 때문.
        but, main{}안에 사용된 num은 전역변수로, 지역변수에서 사용가능하다.
        만약 전역에 int i를 선언해주면 for문에서는 int안써도 됨. 근데 쓰는게 관례
        */

        //for(1)
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    //for(2)
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        /*
        *for문 단순하게 생각하기
         -초기식은 무조건 i로 시작!
         -조건식은 반복하는 횟수로 이해! 위의 예시는 10번 실행된다. ('<'기준)
         */
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
        String str = "코리아아이티";
        System.out.println(str.substring(0,3)); //0부터 3 이전까지 짜름


    }
}
