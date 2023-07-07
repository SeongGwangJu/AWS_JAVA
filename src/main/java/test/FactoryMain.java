package test;

import ch14_싱글톤.Samsung;

class Factory {
    private static Factory instance;

    private String factoryName;
    private Factory() {
        factoryName = "Apple";
    }

    public static Factory getInstance() {
        if(instance == null) {
            instance = new Factory();
        }
        return instance;
    }
    //여기 위까지만 작성하면 정답.

    public String getFactoryName() {
        return factoryName;
    }
    public String test(String str) {
        return str;
    }
    public int sub(int num1, int num2) {
        return num1 - num2;
    }
}
public class FactoryMain {
    public static void main(String[] args) {
        Factory factory = Factory.getInstance();
        Factory factory1 = Factory.getInstance();

        System.out.println(factory.getFactoryName());

        String str1 = "Samsung";
        String str2 = "Samsung";

        boolean flag = (factory.test("Samsung") == factory1.test("Samsung"));
        boolean flag2 = str1 == str2;
        System.out.println(flag);
        System.out.println(flag2);

    }

}
