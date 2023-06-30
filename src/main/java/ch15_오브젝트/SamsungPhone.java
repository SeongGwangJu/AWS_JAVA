package ch15_오브젝트;

public class SamsungPhone {

    private String model;

    public SamsungPhone(String model) {
        super(); //상속했을때 쓰는게 왜 있냐? -> 사실 얘는 Object 클래스~
        //자바의 모든 클래스는 Object를 상속받음(
        //자료형 분리할 때 오브젝트를 쓴다
        this.model = model;
    }


}
