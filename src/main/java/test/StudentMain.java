package test;
//정답
import java.util.ArrayList;
import java.util.List;

class Student {
    private int studentCode;
    private String studentName;

    public Student(int studentCode, String studentName) {
        this.studentCode = studentCode;
        this.studentName = studentName;
    }

    public void showStudent() {
        System.out.println("학번:" + studentCode + ", " +"이름: " +studentName);
    }
}

public class StudentMain {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1001, "홍길동"));

        students.add(null);

        students.add(new Student(1003, "김영희"));


        //null값 영역 제거

        students.remove(null);


        //문제의 '해결 후' 와 같이 출력되도록 값 추가

        students.add(1, new Student(1002,"강철수"));

        //근데, 제거-> 추가 안해도 Set 하면 된다.

        students.set(1, new Student(1002, "강철수2"));


        for(Student student : students) {

            student.showStudent();

        }

    }

}