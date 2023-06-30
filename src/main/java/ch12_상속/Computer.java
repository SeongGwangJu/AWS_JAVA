package ch12_상속;

public class Computer extends Product{
    private String type;

    //all args 밖에 없으면, super에 매개변수가 들어가야 된다.
/*    public Computer() {
        super("", 10);
        System.out.println("컴퓨터 객체 생성");
    } */

    //superclass 생성


    public Computer(String model, int price) {
        super(model, price);
    }

    public Computer(String model, int price, String type) {
        super(model, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
