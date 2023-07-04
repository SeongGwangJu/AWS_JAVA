package ch21_JSON;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

public class Json01 {
    public static void main(String[] args) {

        System.out.print("hashMap 출력예시 : ");

        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("productCode", "P20230704");
        dataMap.put("productName", "아이폰15");
        System.out.println(dataMap);

        System.out.print("Json 출력예시 : ");

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("productCode", "P20230704");
        jsonObject.addProperty("productName", "아이폰15");
        System.out.println(jsonObject);
        /*
        computer to server, TCP/IP 통신으로 보낼 때 객체를 보내진 못함. 문자를 통해서 가능
        so Json을 통해 변환해 통신할때는 Json으로 바꿔서 통신한다.
         */


        System.out.print("Map to Json : ");

        Gson gson = new Gson();
        System.out.println(gson.toJson(dataMap)); //Map을 Json형태로 바꾼것. 문법 기억!


        System.out.print("Json to Map : ");

        Map<String, Object> jsonMap = gson.fromJson(jsonObject, Map.class);
        System.out.println(jsonMap);
        System.out.println(jsonMap.get("productCde"));
    }
}
