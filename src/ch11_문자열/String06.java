package ch11_문자열;

public class String06 {
    public static void main(String[] args_) {
    String token = " Bearer aaaaabbbbbbbbbbb.cccccccccccccdddddddeeeeee";

    boolean flag = token.startsWith("Baearer");
        System.out.println(flag);

        String url = "set.api/v1.iuser/1";
        boolean flag2 = url.startsWith("api/v1");
        if(flag2) {
            System.out.println("api v1사용중");
        }
    }
}

