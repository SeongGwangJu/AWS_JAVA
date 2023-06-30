package ch14_싱글톤;
public class SamsungFactory {

    public Galaxy produce(String model) {
        System.out.println(Samsung.getInstance().getCompanyName()
                + "에서 스마트폰을 생산합니다.");
        int newSerialNumber = Samsung.getInstance().getAutoIncrementSerialNumber() +1;
        Samsung.getInstance().setAutoIncrementSerialNumber(newSerialNumber);

        return new Galaxy(0, model); //Galaxy객체를 생성해서 Galaxy에 넣어줌

    }

    public void showCompanyName() {
        System.out.println("회사명 : " + Samsung.getInstance().getCompanyName());
    }
}
