package test;
//맞춘 문제 -> Answer 별도입력X.
class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int sub(int num1, int num2) {
        return  num1 - num2;
    }
}

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(10,20));

        System.out.println(calculator.sub(200,100));

    }

}
