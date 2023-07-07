package test;

import java.util.*;

class Customer {
    private  String name;
    private  String rating;
    private  int age;

    public Customer(String name, String rating, int age) {
        this.name = name;
        this.rating = rating;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class MapList {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        List<Map> customers = new ArrayList<>();
        map.put("name", "홍길동");
        map.put("rating", "vip");
        map.put("age", 30);
        map.put("name", "김기영");
        map.put("rating", "gold");
        map.put("age", 35);

        for (int i = 0; i < customers.size(); i++) {
            for (Map entry : customers) {
                System.out.print(entry.keySet() +":");
                System.out.println(entry);

            }
        }
    }
}
