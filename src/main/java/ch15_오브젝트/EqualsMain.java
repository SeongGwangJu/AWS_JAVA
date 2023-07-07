package ch15_오브젝트;

import lombok.*;

//@Getter
//@Setter


 public class EqualsMain {
    public static void main(String[] args) {
        KoreaStudent koreaStudent1 = new KoreaStudent("20230001", "변정민");
        KoreaStudent koreaStudent2 = new KoreaStudent("20230002", "정가영");
        KoreaStudent koreaStudent3 = new KoreaStudent("20230003", "정혜성");
        KoreaStudent koreaStudent4 = new KoreaStudent("20230001", "변정민");

        //메모리 주소비교
        System.out.println(koreaStudent1 == koreaStudent4);

        //데이터(값)비교
        //System.out.println(koreaStudent1.getStudentCode() == koreaStudent4.getStudentCode()
        //        && koreaStudent1.getName() == koreaStudent4.getName());

        //매번 이렇게 번거롭게 get으로 비교할거임? equals를 이용하자.
        System.out.println(koreaStudent1.equals(koreaStudent4));
        System.out.println(koreaStudent1.equals(koreaStudent3));

    }
}