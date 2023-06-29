package ch08_생성자;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("김준일"); //객체생성
        System.out.println(s1);
/*        s1.name = "김준일";
        s1.age = 30;
        s1.address = "동래구";*/

        System.out.println(s1.name);

        //객체 생성과 동시에 대입 = 생성자
        Student s2 = new Student("주성광", 30, "금정구");{
            System.out.println(s2.name);


        }
    }
}
