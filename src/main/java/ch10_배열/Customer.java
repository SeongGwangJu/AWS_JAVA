package ch10_배열;

public class Customer {
    private String name;
    private String rating;

    //전체생성자(all args)
    public Customer(String name, String ratings) { //다른 패키지 안에서도
        this.name = name;
        this.rating = ratings;
    }

    public void  showInfo() {
        System.out.println("고객명 :" +name);
        System.out.println("고객등급" + rating);
        System.out.println();
    }

}
