package ch11_문자열;

public class String01 {
    public static void main(String[] args) {
        String str;
        str = "코리아 아이티 아카데미";
        System.out.println(str == "코리아 아이티 아카데미"); //'==' : '주소가 같냐?'를 비교. 리터럴이라.
        System.out.println(str);

        String str2 = "코리아 아이티 아카데미";
        System.out.println(str == "코리아 아이티 아카데미"); //'==' : '주소가 같냐?'를 비교. 리터럴이라.
        System.out.println(str2);

        String str3 = new String("코리아 아이티 아카데미"); // 위에거 하고 차이가 뭐길래 false냐? 알고갈 것.
        System.out.println(str3 == "코리아 아이티 아카데미");
        System.out.println(str3);

        String str4 = new String("코리아 아이티 아카데미".getBytes()); //....??
    }
}
