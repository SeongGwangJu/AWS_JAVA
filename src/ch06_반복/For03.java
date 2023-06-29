package ch06_반복;

public class For03 {
    public static void main(String[] args) {

        int n = 5;
        //줄바꿈마다 한 개씩 늘어나는 별
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //줄바꿈마다 한 개씩 적어지는 별
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //별 늘어나는데 오른쪽 정렬
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) { //공백 : 4 -> 0 /
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) { //별 1 -> 5
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
