package ch10_배열;

public class DoubleArray {
    public static void main(String[] args) {
        String[][] students = new String[2][2];

        students[0][0] = "김준일";
        students[0][1] = "주성광";
        students[1][0] = "동래구";
        students[1][1] = "금정구";

        for(int i = 0; i < students.length; i++) {
            for(int j = 0; j < students[i].length; j++) {
                //~[i].length : 배열 안에 배열이 있다고 이해
                System.out.println(students[i][j]);
            }
        }
    }
}
