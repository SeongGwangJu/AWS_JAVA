package ch8_생성자;

public class Student {

    final String name; //필수, 고정으로 들어가야하는. RequiredArgs 쓰려면 final로 해야함
    //초기화를 하지 않아 빨간줄이 뜸.
    int age;//데이터. 멤버변수 또는 필드
    String address;

/*    Student() {     //생성자
        name = "";
        System.out.println("NoArgsConstructor"); //매개변수가 없는 생성자
        System.out.println("학생 한 명을 생성합니다.");

    }*/

   Student(String name, int age, String address) {
        System.out.println("AllArgsConstructor"); //모든 전역변수를 가진
        // name = name; 얘는 위의 매개변수 name (가까운 지역변수)
        this.name = name;  // 이 this는 자기자신의 주소.
        this.age = age;
        this.address = address;

    }

    Student(String name) {
        System.out.println("RequiredArgsConstructor"); //Required: 비어있을 수 없는, 필수.

        this.name = name;
    }
    //no Args를 쓰고싶으면 따로 생성해줘야한다.
    //NoArgs와 requiredArgs 둘 중 하나밖에 못쓴다. 이쪽 개념 또 볼것..
}
