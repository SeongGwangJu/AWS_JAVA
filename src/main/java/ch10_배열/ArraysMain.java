package ch10_배열;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        //java.util의 Arrays를 import
        //.을 붙이면 배열을 다룰수 있는 기능들이 담겨있다.
        // -binarySearch : 이진탐색
        //compare : 실제 값이 같은지 아닌지 비교 vs equals : 주소가 같은지 비교
        //copy of : 얕은복사(주소만 옮기는 것) 깊은복사(값 자체를 복사) 중 후자.
        // fill : 배열 전체를 처음부터 끝까지 다 채워넣겠다.

        //Arrays의 기능 예시(1) : sort
        int[] numbers = new int[] {10, 4, 5, 2, 8 ,7, 1};
        for(int i = 0; i < numbers.length; i++) {
            if(i == 0) {
                System.out.print("[");
            }
            System.out.print(numbers[i]);

            if(i == numbers.length -1) {
                System.out.println("]");
            } else {
                System.out.print(",");
            }

        }
        //정렬하면?
        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length; i++) {
            if(i == 0) {
                System.out.print("[");
            }
            System.out.print(numbers[i]);

            if(i == numbers.length -1) {
                System.out.println("]");
            } else {
                System.out.print(",");
            }
        }

    }
}
