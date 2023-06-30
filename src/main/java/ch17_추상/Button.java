package ch17_추상;

public interface Button { //인터페이스 = 설계도
    public int buttonCount = 4; // buttonCount는 스태틱 상수다.

    public void powerOn();
    public void powerOff();
    public void VolumeUp();
    public void VolumeDown();

}
