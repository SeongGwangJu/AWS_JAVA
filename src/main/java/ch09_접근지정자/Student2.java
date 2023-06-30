package ch09_접근지정자;

public class Student2 {
    private String name; //private을 하는 순간, Main클래스에서 's.name'은 작동x
    private int age;

    //private -> 외부에서는 이 메서드를 호출할 수 없다
    //따라서 이 클래스 내부에서만 쓰는거. 캡슐화.
    private void test() {
        System.out.println("테스트 메소드 호출");
    }
    //Setter : 값을 셋팅해줌.
    //만약 접근 지정자를 안씀 = default : 만약 다른패키지에서 쓰려하면 못 씀
    public void setName(String name) {
        test();
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    //Getter : 값을 가지고 와줌.
    public String getName() { //얘를 호출하면 저장되어있는 name 값을 불러와줌.
        return name;
    }

    int getAge() {
        return age;
    }
}
