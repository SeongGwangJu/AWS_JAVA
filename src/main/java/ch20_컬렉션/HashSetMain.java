package ch20_컬렉션;

import java.util.HashSet;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<TestUser> testUsers = new HashSet<>();
        testUsers.add(TestUser.builder().username("aaa").password("1234").build());
        testUsers.add(TestUser.builder().username("bbb").password("1111").build());
        testUsers.add(TestUser.builder().username("ccc").password("2222").build());
        testUsers.add(TestUser.builder().username("ddd").password("3333").build());

        System.out.println(testUsers);
        //System.out.println(testUsers.get(0)); //인덱스 값이 없기때문에 0번값이 나오고 그런거 없다.

        TestUser value = null;

        for(TestUser testUser : testUsers) { //TestUser타입의  testUser 변수에 HashSet의 각 요소들을 순차적 대입.
            if(testUser.getUsername().equals("ccc")) { //testUser객체의, Username이 "ccc"와 같다면~
                System.out.println(testUser);
                value = testUser;
                break;
            }
        }
    }
}
