package test;

//=============== Order Class ===============
class Order {
    private int orderId;
    private String productName;
    private String consumerName;
    private int price;
    private int stock;

    //allarg
    public Order(int orderId, String productName, String consumerName, int price, int stock) {
        this.orderId = orderId;
        this.productName = productName;
        this.consumerName = consumerName;
        this.price = price;
        this.stock = stock;
    }
    //1.
    public static OrderBuilder builder() {
        return new OrderBuilder();
    }

    public void showOrderInfo() {
        System.out.println(orderId);
        System.out.println(productName);
        System.out.println(consumerName);
        System.out.println(price);
        System.out.println(stock);
    }


//=============== Order Builder Class ===============

    public static class OrderBuilder {

        private int orderId;
        private String productName;
        private String consumerName;
        private int price;
        private int stock;

        //3. all arg로 return
        public Order build() {
            return new Order(orderId, productName, consumerName, price, stock);
        }

        //2. 값이 들어가는 부분 작성.
        public OrderBuilder OrderId(int orderId) {
            this.orderId = orderId;
            return this;
        }

        public OrderBuilder ProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public OrderBuilder ConsumerName(String consumerName) {
            this.consumerName = consumerName;
            return this;
        }

        public OrderBuilder Price(int price) {
            this.price = price;
            return this;
        }

        public OrderBuilder Stock(int stock) {
            this.stock = stock;
            return this;
        }

        //
        public OrderBuilder() {
            this.orderId = orderId;
            this.productName = productName;
            this.consumerName = consumerName;
            this.price = price;
            this.stock = stock;
        }
    }
}

//=============== Order Main Class ===============
public class OrderMain {
    public static void main(String[] args) {
        Order order = Order.builder()
                .OrderId(100)
                .ProductName("Samsung GalaxyBook2 Pro")
                .ConsumerName("홍길동")
                .Price(1450000)
                .Stock(2)
                .build();

        order.showOrderInfo();

    }
}
