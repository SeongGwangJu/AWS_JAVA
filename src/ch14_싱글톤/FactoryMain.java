package ch14_싱글톤;

public class FactoryMain {

    public static void main(String[] args) {
        Samsung samsung = new Samsung(); //samsung 객체 생성, 100번주소
        SamsungFactory factory1 = new SamsungFactory(samsung); //200번주소에 +100번주소.
        SamsungFactory factory2 = new SamsungFactory(samsung); //300번주소
        //이렇게 함으로써 Samsung클래스의 CompanyName과 auto~를 쓸 수 있다.
        /*
        싱글톤 -> 유일한 객체 생성, 그 객체만 쓰겠다. 어디서나 그 객체를 쉽게 접근가능.
        스태틱을 이용해......
         */


        factory1.produce("갤럭시s").showInfo();  //갤럭시를 생성하고 showinfo메서드로 호출
        //factory1.produce("")가 주소

        factory2.produce("갤럭시s2").showInfo();
        factory1.produce("갤럭시s3").showInfo();


    }
}
