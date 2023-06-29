package ch13_스태틱;

public class Iphone {
    private static int autoInclement = 1;
    private int serialNumber = 20230600;
    private String model;

    public Iphone(int serialNumber, String model) {
        //super(); //인텔리에선 자동으로 생략되어있다.
        /*this.serialNumber = serialNumber;
        this.model = model;*/

        //autoInclement를 쓴다면 이렇게. static은 공유하기때문에 변수처럼 쓸 수 있어서 자동증가 가능.
        this.serialNumber += autoInclement;
        this.model = model;
        autoInclement++;
    }

    public void showInfo() {
        System.out.println("serial = " + serialNumber);
        System.out.println("model = " + model);
    }

    public static void main(String[] args) {
        Iphone[] iphones = new Iphone[5];
        for(int i = 0; i < iphones.length; i++) {
            /* iphones[i] = new Iphone((20230600 + i), "아이폰" + i + 1 );
            // 문자열에 숫자를 더해서 문자열이 된다. 그래서 아이폰 01 11 21이렇게됨 */

            iphones[i] = new Iphone((20230600 + i), "아이폰" + (i + 1));
        }

        for(int i = 0; i < iphones.length; i++) {
            iphones[i].showInfo();
        }


    }
}
