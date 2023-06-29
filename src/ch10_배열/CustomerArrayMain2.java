package ch10_배열;

public class CustomerArrayMain2 {

    public static void main(String[] args) {
        Customer[] customers = new Customer[10];

        for(int i = 0; i < customers.length; i++) {
            String[] ratings = new String[] {"Bronze", "Silver", "Gold", "VIP"}; //ratings라는 배열 생성
            customers [i] = new Customer("김준" + (i+1), ratings[i % 4]); //Customer 생성자에 대입
            //System.out.println(customers[i].showInfo());
        }

        for(int i = 0; i < customers.length; i++) {
            customers[i].showInfo(); //출력메서드 실행
        }
    }
}
