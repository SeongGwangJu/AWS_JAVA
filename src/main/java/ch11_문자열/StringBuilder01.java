package ch11_문자열;

public class StringBuilder01 {
    public static void main(String[] args) {
        String str = "abc";
        str = str + "def";

        StringBuilder builder = new StringBuilder();
        //String str2 = stringBuilder; //String 자료형이 아니므로 이렇게 대입x
        builder.append("이름 : "); //append : 끝에다가 괄호 안 내용을 '추가'한다.
        builder.append("주성광"); //append : 끝에다가 괄호 안 내용을 '추가'한다.
        builder.insert(2, ">>"); //인덱스 2에다가 ">>" 삽입
        System.out.println(builder);

        //콜론을 지우고싶다? 콜론부터 콜론+1 위치까지 지우면 됨.
        builder.delete(builder.indexOf(":"), builder.indexOf(":") +1 );

        String str2 = builder.toString();
        System.out.println(builder.toString());

        //여기까지 내용을 스트링 자료형으로 지운다면?
        String name = "이름: 주성광";
        System.out.println(
                name.substring(0, name.indexOf(":"))    // :전까지 짜름
                .concat(name.substring(name.indexOf(":") +1))); //: +1부터 짜른 내용을 concat.

        //위의 걸 해석하면
        System.out.println(
                name.substring(0,2)
                        .concat(name.substring(3)));

        //String Buffer vs Builder

    }
}
