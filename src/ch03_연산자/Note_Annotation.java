package ch3_연산자_0626;

public class Note_Annotation {
    public static void main(String[] args) {
        // 주석 : 코드의 설명을 작성할 때 사용한다. 컴파일 시 무시된다.
        //내용

        System.out.println("주석테스트1");

        // '/* 내용 */' : 여러 줄 주석
        /*
        내용
        @author
         */

        // '/**내용 */' : 여러 줄 주석
        /**
         * 여기도 주석
         * 여기도 주석
         * @author code1218(주성광)
         * @version v.1.0.1
         * @since 2023-06-26
         * @apiNote
         *  -Method: get
         *  -URL : https://localhost:8080/test
         *
         */

        //        System.out.println("주석테스트2"); // ctrl + /
        /*System.out.println("주석테스트3"); */ //ctrl + shift + / :선택한 영역에 여러줄주석
        /** System.out.println("주석테스트4"); */

        System.out.println("dd");
    }
}


// '//' : 한 줄 주석


