package ch06_반복;

public class For01 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(numbers[0]);

        /*
        for(초기식; 조건식; 증감식) {
        실행문
        }
        */
        for (int i = 0; i < 6; i++) { //i(index)는 임시변수, i j k ...
            System.out.println(numbers[i]);
            System.out.println("i = " + i);
        }

    }
}
