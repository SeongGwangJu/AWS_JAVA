package ch22_익명클래스;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestFunctionMain {
    public static void main(String[] args) {

        //     TestFunction1 function1 = () -> {
        //        System.out.println("매개변수x, 리턴x");
        //    };

        //생성과 메서드 정의가 동시에 이루어진다.
        //명령문이 하나인 경우 중괄호를 생략할 수 있다
        TestFunction1 function1 = () -> System.out.println("매개변수x, 리턴x");

        function1.test();
        System.out.println("======================");


        //매개변수는 타입을 생략할 수 있다.
        // 그리고 매개변수가 하나인 경우에는 괄호()도 생략가능하다.
    /*    TestFunction2 function2 = (int num) -> {
            System.out.println("매개변수 1개, 리턴 x");
            System.out.println("num : " + num);
        }; */
        TestFunction2 function2 = num -> {
            System.out.println("매개변수 1개, 리턴 x");
            System.out.println("num : " + num);
        };

        function2.test(100);
        System.out.println("======================");


        //오버라이드 할때는 매개변수의 변수명 임의로 설정 가능(age, name).
        //매개변수가 없거나 두개 이상일 경우에는 매개변수의 괄호를 생략할 수 없다.
        TestFunction3 function3 = (age, name) -> {
        System.out.println("매개변수 2개, 리턴x");
        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name);
        };
        function3.test(30, "주성광");
        System.out.println("======================");


        //명령이 한줄인 경우 중괄호를 생략할 수 있으며 중괄호를 생략한 경우 즉시 리턴값이 된다.

    /*    TestFunction4 function4 = (age, name) -> {
            //System.out.println("매개변수 2개, 리턴O");
            return "나이 : " + age + ", 이름 : " + name;
        };*/
        TestFunction4 function4 = (age, name) -> "나이 : " + age + ", 이름 : " + name;

        String result1 = function4.test(30, "주성광");
        System.out.println("======================");


        //문법 꼭 복습할 것!

        Runnable runnable = () -> {
            System.out.println("매개변수x, 리턴x");
        };

        runnable.run();
        System.out.println("======================");


        Consumer<String> consumerStr = name -> {
            System.out.println(name);
        };

        consumerStr.accept("주성광");

        BiConsumer<String, Integer> biConsumer = (name, age) -> {
            System.out.println("bi이름 : " + name);
            System.out.println("나이 : " + age);
        };

        biConsumer.accept("주성광", 30);
        System.out.println("======================");


        Supplier<Integer> supplier = () -> 100;
        System.out.println(supplier.get());
        System.out.println("======================");


        Function<Integer, String> function = year -> "생일 : " + year;
        System.out.println(function.apply(1994));
        System.out.println("======================");


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        //numbers.removeIf(Predicate <? super Integer> filter) (boolean)
        numbers.removeIf(num -> num % 2 == 0); //predicat : 참이면 제거한다.
        System.out.println(numbers);
        System.out.println("======================");


        //forEach(Consumer<? super E> action) {
        numbers.forEach(num -> System.out.println("출력 : " + num)); //향상된 for문을 함수형으로 만들어 놓은것.

    }
}
