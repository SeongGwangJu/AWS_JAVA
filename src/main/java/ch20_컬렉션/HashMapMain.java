package ch20_컬렉션;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {
        //Key와 Value를 동시에 저장가능한 Map!
        HashMap<String, String> strMap = new HashMap<>();
        strMap.put("username","aaa");
        strMap.put("password","1234");
        strMap.put("name","주성광");

        System.out.println(strMap);
        System.out.println(strMap.get("username")); //Key를 통해 Value를 검색

        System.out.println("========");
        /* strMap.entrySet Set<Entry<String, String>>
        Map에서 반복문을 사용하도록 도와주는 entrySet.
        Map의 자료형을 그대로 따라감, key value의 Entry(인터페이스)를 담고있는 Set.
         */
        for (Map.Entry<String, String> entry : strMap.entrySet()) {
            System.out.print(entry.getKey() + " : ");
            System.out.println(entry.getValue());
        }

        System.out.println("=====================");

        for(String key : strMap.keySet()) {
            System.out.print(key + " : ");
            System.out.println(strMap.get(key));
        }
    }
}
