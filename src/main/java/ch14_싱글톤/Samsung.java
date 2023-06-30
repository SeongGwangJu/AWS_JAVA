package ch14_싱글톤;

import java.time.LocalDate;
import java.util.Date;

public class Samsung {

    //어디서든 쓸 수 있도록 static으로 바꾸자
    private static Samsung instance; //삼성 객체를 담을 수 있는 인스턴스변수


    private String companyName;
    private int autoIncrementSerialNumber
            = LocalDate.now().getYear() * 10000; //LocalDate라는 클래스, now스태틱 메소드

    //public to private
    private Samsung() {
        companyName = "SAMSUNG";
    }

    //싱글톤 : 하나의 유일한 객체를 만들어 저장. 다른 곳에서 더이상 객체생성x
    public static Samsung getInstance() {
        if(instance == null) { //맨 처음에는 null
            instance = new Samsung(); //삼성을 넣어줌
        }
        return instance;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setAutoIncrementSerialNumber(int autoIncrementSerialNumber) {
        this.autoIncrementSerialNumber = autoIncrementSerialNumber;
    }

    public int getAutoIncrementSerialNumber() {

        return autoIncrementSerialNumber;
    }
}
