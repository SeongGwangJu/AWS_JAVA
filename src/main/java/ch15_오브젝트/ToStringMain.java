package ch15_오브젝트;

public class ToStringMain {
    @Override
    public String toString() {
        return "ToStringMain{}";
    }

    public static void main(String[] args) {
        KoreaStudent koreaStudent = new KoreaStudent("20230001", "김영훈");

        //toString : 객체안에 든 값을 확인할때 사용
        System.out.println(koreaStudent +"1"); //주소값 출력됨
        System.out.println(koreaStudent.toString()+"2"); //위와 마찬가지. 생략해도됨

        String str = koreaStudent.toString();
        //String str2 = koreaStudent; //근데 변수에 넣을려면 위에처럼 적어줘야함
        System.out.println(koreaStudent.toString()+"3");

/*
강사님 깃 참고해서 정상사용법 찾아낼것!(generate)
 */

    }
}
