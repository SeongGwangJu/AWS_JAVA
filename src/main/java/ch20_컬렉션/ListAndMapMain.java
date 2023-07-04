package ch20_컬렉션;

import ch07_클래스.A;
import ch20_컬렉션.TestUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListAndMapMain {
    public static void main(String[] args) {
        List<TestUser> testUsers = new ArrayList<>(); //TestUser클래스에서 Str, Str타입
        testUsers.add(TestUser.builder()
                .username("aaa")
                .password("1234")
                .build());

        //System.out.println(testUsers.get(username));

        Map<String, Object> responseData = new HashMap<>(); //Object타입 기억!
        responseData.put("testUserList", testUsers); //위의 List testUsers를 불러옴.
        responseData.put("Statuscode", "OK" );


        System.out.println(responseData);
        for (TestUser testUser
                : (List<TestUser>) responseData.get("testUserList")) { //형변환

        }
        System.out.println("=====test=====");
        System.out.println(responseData.get("testUserList"));



    }
}
