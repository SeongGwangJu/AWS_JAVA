package ch17_추상;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Pad extends  SmartDevice{

    private boolean availabilityPen;

    public Pad(String deviceName, double displaySize, boolean availabilityPen) {
        super(deviceName, displaySize);
        this.availabilityPen = availabilityPen;
    }

    @Override
    public void connectedWifi() {
        //super.connectedWifi();
        System.out.println("패드의 와이파이를 연결합니다.");
    }
}
