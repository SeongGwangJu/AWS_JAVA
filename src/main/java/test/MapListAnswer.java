package test;

import java.util.*;

class Customer2 {
    private  String name;
    private  String rating;
    private  int age;

    public Customer2(String name, String rating, int age) {
        this.name = name;
        this.rating = rating;
        this.age = age;
    }

    //getset.
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

public class MapListAnswer {
    public static void main(String[] args) {
        List<Map> customers = new ArrayList<>();

        Map<String, Object> map = new HashMap<>();
        map.put("name", "홍길동");
        map.put("rating", "vip");
        map.put("age", 30);
        customers.add(map);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("name", "김기영");
        map2.put("rating", "gold");
        map2.put("age", 35);
        customers.add(map2);

        for (Map<String, Object> customer : customers) {
            for (Map.Entry<String,Object> entry : customer.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                System.out.print(key + " : " + value +"\n");
            }
            System.out.println();
        }

    }
}
