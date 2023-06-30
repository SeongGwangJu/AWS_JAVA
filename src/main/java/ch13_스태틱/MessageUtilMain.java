package ch13_스태틱;

import ch10_배열.Array01;

public class MessageUtilMain {

    private int a;

    //메인메소드는 클래스 안에 들어있다
    public static void main(String[] args) {

        //*공책 내용
        //System.out.println(a); //안된다
        MessageUtilMain messageUtilMain = new MessageUtilMain();
        System.out.println(messageUtilMain.a); //생성하면 출력 된다

        MessageUtil messageUtil = new MessageUtil(); //생성먼저

        //다른 패키지의
        Array01.main(null);
        /*
        messageUtil.sendMail(); //스태틱x
        messageUtil.sendFile(); //스태틱o
         */

        MessageUtil.sendFile(); //스태틱 : 생성 할 필요가 없다.(위에다 생성자를 주석해도 상관x)
        System.out.println(); //Sysout : 대문자 : 생성한 적 없는데 알아서 된다. ctrl +u 해보면 이것도 스태틱임.
        MessageUtil.data = "안녕"; //data는 변수다.

        //아래 네 문장의 차이를 생각해보자
        System.out.println(MessageUtil.data); }}
        //System.out.println(messageUtil.data);

        //차이(주소)가 있는데도 왜 똑같이 안녕이 출력되나? 스태틱이기때문.

        /* 즉, 스태틱은 어디서나 생성없이 그때그때 꺼내는 곳에 쓴다. system.out, Arrays 등등의 java.util 들.
            */