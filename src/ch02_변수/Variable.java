package ch2_변수;

public class Variable {
    public static void main(String[] args) {

        boolean flag; // 선언
        flag = true; //초기화(=대입). 선언을 했으면 초기화를 해줘야한다.
        System.out.println("flag = " + true); //자동완성 : soutv

        char lastName = '김'; //한 줄로 선언과 초기화.
        System.out.println(lastName); //자동완성 : sout

        int number = 100;
        System.out.println("번호" + number);
        long long1 = 12345678900l; //뒤에 l추가
        System.out.println(long1);

        float float1 = 3.14f; //뒤에 f추가
        System.out.println(float1);
        double pi = 3.141592;
        System.out.println(pi);


        String num1 = "10";
        int num2 = 10;
        System.out.println("String : " + num1);
        System.out.println("int : " + num2);
        System.out.println(num1 + num2); // "10" + 10 = 1010
        System.out.println(Integer.parseInt(num1) + num2); //그냥 참고

        /* 상수 : 변하지 않는 값 */
        final double PI = 3.14; // 상수는 모든 글자가 대문자이고, 스네이크표기법으로 한다.
        System.out.println(PI);

        /* 리터럴 상수 */
        int number1 = 1;
        double number2 = 3.14159; // 위의 1과 옆의 3.14159은 리터럴 상수. 변하지 않는다.
        String name = "주성광"; // 왜 String만 대문자냐? = 클래스.
        System.out.println(name);

        /* Casting? 영입. Up Casting / Down Casting
         * 문자 - 정수 - 실수 순서!*/
        char num3 = '5';
        System.out.println(num3 + num2); // '5' = 53. char to int casting
        System.out.println((int) num3); // char to int Casting : (int)

        /* 묵시적 형 변환 (Up Casting) */
        int num4 = num3; // (int) 없이도 char(num3) to int.
        System.out.println(num4);

        /* 2. 명시적 형변환 (Down Casting) 값이 큰 범위에서 작은 범위로 변환.*/
        char num5 = (char) num4; //int to char는 (char)를 붙여줘야 된다.
        System.out.println(num5);




    }
}
