package ch15_오브젝트;

import java.util.Objects;

public class KoreaStudent {
    private String studentCode;
    private String name;

    public KoreaStudent(String studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
    }



    @Override //재정의(=상위클래스에 있는걸 자식클래스에서 다시 정의한다.)
    // 상속받아 하위클래스에서 내용을 바꾸겠다.
    // '@' = 어노테이션. 없어도 정상작동함.

    public boolean equals(Object obj) { //ctrl +u로 object.java가보면 원리를 알 수 있다.
        KoreaStudent koreaStudent = (KoreaStudent) obj; //obj엔 studentCode가 없다. 업캐스팅 해줘야함.
/*        boolean equalsFlag = this.studentCode == koreaStudent.studentCode
                && this.name == koreaStudent.name; */
        boolean equalsFlag = this.studentCode.equals(koreaStudent.studentCode)
                && this.name.equals(koreaStudent.name);
        return equalsFlag; //학번과 이름이 같은지 확인하고 true/false로 리턴
    }

    //위 내용 주석처리하고 alt +ins -> eqals...해볼것
    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KoreaStudent that = (KoreaStudent) o;
        return Objects.equals(studentCode, that.studentCode) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentCode, name);
    } */

    @Override
    public String toString() {
        return super.toString();
    }

    public void showwIfno() {
        System.out.println("학번 + " + studentCode);
        System.out.println("이름 = " + name);
        System.out.println("=============");
    }

    public String getStudentCode() {
        return studentCode;
    }

    public String getName() {
        return name;
    }
}
