package ch17_추상;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class SmartPhone extends SmartDevice implements Button{

    private String phoneNumber;

    public SmartPhone(String deviceName, double displaySize, String phoneNumber) {
        super(deviceName, displaySize);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void connectedWifi() {
        //super.connectedWifi();
        System.out.println("스마트폰의 와이파이에 연결합니다.");
    }

    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {

    }

    @Override
    public void VolumeUp() {

    }

    @Override
    public void VolumeDown() {

    }
}

