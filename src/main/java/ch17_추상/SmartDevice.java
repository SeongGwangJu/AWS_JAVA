package ch17_추상;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data

public abstract class SmartDevice { //abastract를 붙이면 추상클래스가 된다.
    /*패드와 스마트폰이 가지는 공통변수를 모아둔 곳.
    이게 추상화. 틀의 설계도와 같다.
     */
    private  String deviceName;
    private  double displaySize;

    //public void connectedWifi() {    }  //어차피 오버라이드 할거 그냥 비워둔다. 껍데기만 냅둠.
    public abstract void connectedWifi();

}
