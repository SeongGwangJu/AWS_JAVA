package ch21_JSON;

import com.google.gson.Gson;

public class Json02 {
    public static void main(String[] args) {
        Gson gson = new Gson();

        JsonUser jsonUser = JsonUser.builder()
                .username("aaa")
                .password("1234")
                .build();

        System.out.println(jsonUser+ " 1");

        String jsonData = gson.toJson(jsonUser);
        System.out.println(jsonData + " 2");

        JsonUser jsonUser2 = gson.fromJson(jsonData, JsonUser.class);
        System.out.println(jsonUser2 + " 3");

    }
}
