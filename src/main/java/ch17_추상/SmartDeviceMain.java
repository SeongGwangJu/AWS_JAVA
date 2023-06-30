package ch17_추상;

public class SmartDeviceMain {
    public static void main(String[] args) {

    SmartPhone smartPhone = new SmartPhone("아이폰",
            6.1, "010-4192-1784");

    Pad pad = new Pad("아이패드",
            10.1 , false);

    //SmartDevice device = new SmartDevice(null, 0); //껍데기 밖에 없다.
        //추상클래스를 만드니까 생성이 불가능해진다.
    System.out.println(smartPhone);
    System.out.println(pad);

    smartPhone.connectedWifi();
    pad.connectedWifi();
    }
}
