package ch15_오브젝트;


import ch14_싱글톤.Samsung;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetClassMain {
    public static void main(String[] args) {

        KoreaStudent koreaStudent = new KoreaStudent("20230001", "주성광");
        System.out.println(koreaStudent.getClass()); //class명을 가져옴, 뒤에. 붙여서 참조 가능

        System.out.println("============메서드 확인 ");
        //koreaStudent 클래스 안에 선언된 메서드를 확인
        Method[] methods = koreaStudent.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println("getName : " + methods[i].getName()); //메소드의 이름들 출력
            System.out.println("ReturnType : " + methods[i].getReturnType());
            methods[i].getName();
        }

        System.out.println("==================필드 확인");
        //클래스 안에 생성된 Fields를 입력후 name을 출력
        Field[] fields = koreaStudent.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
        }

        System.out.println("========아래는 클래스를 비교 ");
        System.out.println(KoreaStudent.class == koreaStudent.getClass()); //클래스와 객체의 클래스를 비교
        System.out.println(koreaStudent instanceof KoreaStudent); //위랑 똑같음

        System.out.println("====아래는 SimpleName, name====");
        System.out.println(koreaStudent.getClass().getSimpleName());
        System.out.println(koreaStudent.getClass().getName());

        System.out.println("====class의 Name을 get해서 문자열 입력하는 방법====");
        String str = "SAMSUNG";
        String str2 = Samsung.class.getSimpleName().toUpperCase();
        System.out.println(str);
        System.out.println(str2);
    }
}
