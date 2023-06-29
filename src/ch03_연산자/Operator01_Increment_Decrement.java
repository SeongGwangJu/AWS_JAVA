package ch3_연산자_0626;

public class Operator01_Increment_Decrement {
    public static void main(String[] args) {
        System.out.println(3 / 2.0); //up casting 후 연산
        //연산자 앞 뒤는 띄운다.
        int num = 10;
        System.out.println(++num); //바로 +1 증가,선증가
        System.out.println(num++); //실행 후 +1증가,후증가
        System.out.println(num);
        System.out.println(--num);
        System.out.println(num++);
        System.out.println(num);




    }
}
