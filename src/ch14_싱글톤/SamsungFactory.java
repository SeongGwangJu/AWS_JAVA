package ch14_싱글톤;

public class SamsungFactory {

    private Samsung samsung;

    public SamsungFactory(Samsung samsung) { //삼성 객체를 받을 수 있다.
        this.samsung = samsung;
    }
    public Galaxy produce(String model) {
        System.out.println(samsung.getCompanyName() +"에서 스마트폰을 생산합니다.");
        return new Galaxy(0, model); //Galaxy객체를 생성해서 Galaxy에 넣어줌

    }

    public void showCompanyName() {
        System.out.println("회사명 : " +samsung.getCompanyName());
    }
}
