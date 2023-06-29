package ch12_상속;

public class ProductArray {
    public static void main(String[] args) {
        Product[] products = new Product[5];

        //박스에 넣고, 모델, 가격, 컴터는 타입, 옷은 색,사이즈 붙임.
        products[0] = new Computer("삼성컴퓨터", 1000, "데스크탑");
        products[1] = new Clothes("하의", 4000, "L", "red");
        products[2] = new Computer("맥북", 2000, "랩탑");
        products[3] = new Clothes("상의", 5000, "M", "black");
        products[4] = new Computer("그램", 3000, "랩탑");


        for(int i = 0; i < products.length; i++) {
            System.out.println("모델명 : " + products[i].getModel()); //n번째 박스꺼내서 모델명만 본다.
            System.out.println("가격 : " + products[i].getPrice());
            if(products[i] instanceof Computer) { //product 객체는 Computer 클래스의 인스턴스라면
                System.out.println("컴퓨터임");
                System.out.println(products[i].getClass()); //참고

                //핵심!! 다운캐스팅을 통해 products에서 Computer의 매개변수를 갖고온다.
                Computer computer = (Computer) products[i]; //다운캐스팅 (박스를 연다)
                System.out.println(computer.getType()); //type을 본다

                //즉! (review필수)
                //System.out.println(products[i].getType()); //product(박스)에 없는 항목이라 안되고

                System.out.println( ( (Computer) products[i]).getType()); //명시적 형변환?
                System.out.println(computer.getModel());


            } else if (products[i] instanceof  Clothes) { //
                System.out.println("옷임");

                //핵심!!
                Clothes clothes = (Clothes) products[i];
                System.out.println("사이즈 : " + clothes.getSize());
                System.out.println("색상 : " + clothes.getColor());
            }
            System.out.println("=========================");
        }
    }
}
