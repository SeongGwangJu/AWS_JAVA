package ch10_배열;

public class Array01 {
    //배열도 객체다.
    public static void main(String[] args) {
        int[] numbers = new int[5]; //생성 : 동적할당
        /*
        int [] = int 배열 자료형.
        int 자료형 5개를 묶고 순서대로 나열, 배열하고 numbers라는 변수에 주소값을 줌
         */
        System.out.println(numbers);
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println(numbers[0]);

        for (int i = 0; i < numbers.length; i++) {
            int index = i;
            System.out.println(numbers[index]);
        }

        //배열 선언하는 다른 방법들
        int[] numbers2 = {1, 2, 3, 4, 5}; //배열 크기 지정과 동시에 바로 값 넣기
        int[] numbers3 = new int[] {6, 7, 8, 9, 10}; // 다른 방법. 위 와의 차이점은 아래에. 명확히 배열임을 표시.

        sum(numbers);
        //sum({1, 2, 3, 4, 5}); //안 됨. 중괄호 붙인다고 배열이 아니다.
        sum(new int[] {6, 7, 8, 9, 10}); //배열임을 명시해줬으므로 가능함.
    }

    public static void sum(int[] array) { //array는 이 지역안에서 쓰는 변수명
        int result = 0;
        for(int i = 0; i < array.length; i++) {
            result += array[i];
        }
        System.out.println(result);
    }

}
