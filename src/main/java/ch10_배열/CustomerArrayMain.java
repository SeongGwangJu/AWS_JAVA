package ch10_배열;

import javax.xml.datatype.Duration;

public class CustomerArrayMain {
    public static void main(String[] args) {
        Customer[] customers = new Customer[10];

        Customer customer1 = new Customer("김준일", "Teacher");
        customer1.showInfo();

        System.out.println("============");
        customers[0] = new Customer("주성광", "gold");
        customers[1] = new Customer("이동헌", "Silver");
        customers[2] = new Customer("문근해", "Vip");

        for (int i = 0; i < customers.length; i++) {
            //customers[i].showInfo();
            //이렇게 해놓으면 나머지 값에 NullPointerException 뜨니까, 밑에처럼 작성
            if (customers[i] == null) {
                continue;
            }

            customers[i].showInfo();
        }


    }
}
