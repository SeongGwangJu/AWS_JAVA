package ch12_상속;

public class ProductMain {
    public static void main(String[] args) {

        Computer computer = new Computer("삼성컴퓨터", 1000, "데스크탑");
        System.out.println(computer.getModel());

        Clothes clothes = new Clothes("상의", 2000, "L", "black");

        //공책 내용 보면서 이해!!
        Product p = clothes; //업캐스팅
        //Computer computer1 = p; //다운캐스팅
        System.out.println("1  "+p.getPrice()); //
        //System.out.println(computer1.type());

        //메모리개념으로 이해할것!!!
        Product product = new Computer("삼성컴퓨터", 3000, "데스크탑"); //닫힌 박스, 안에는 컴퓨터 //업캐스팅
        Computer computer2 = (Computer) product;// 컴퓨터 든 상자를 열었다.
        System.out.println("2  "+product.getPrice());


        Product product2 = new Product("모델", 3000); //박스 만 있음. 내용물은 없음
        Computer computer3 = (Computer) product2; //박스를 열었다고 컴퓨터가 나오겠냐?
        System.out.println("3  "+computer3.getType()); //오류뜨는 이유가 핵심일듯
    }
}
