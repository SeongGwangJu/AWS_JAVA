package ch5_조건;

public class If01 {
    public static void main(String[] args) {
        if(5 < 10) System.out.println("10이 5보다 큽니다"); // true 일 때 출력
        System.out.println("\n");

        if(5 > 10) {
            System.out.println("10이 5보다 큽니다");
            System.out.println("참일 때 출력");
        } else {
            System.out.println("거짓일 때 동작");
            System.out.println("거짓");
        }
    }
    /* 삼항연산자 vs if-else
    cpu 입장에서, 즉 성능 측면으로 보면 삼항연산자를 사용하는게 좋음
    가독성에서는 if-else가 나음. + Scanner 등의 클래스 사용 가능.

     */
}
