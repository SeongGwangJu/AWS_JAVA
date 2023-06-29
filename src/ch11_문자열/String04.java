package ch11_문자열;

public class String04 {
    public static void main(String[] args) {
        String phone = "         010-9988.19 16";

        //여러 경우의 데이터 정제
        String replacePhone = phone.replaceAll("-", "") // "-"를 없애줌
                            .replaceAll(" ", "")
                            .replaceAll("[.]", ""); // '.'은 [.]으로 표시해야함.
        System.out.println(replacePhone);

        String phone2 = phone.trim(); //앞 뒤쪽의 공백 제거
        System.out.println(phone2);
    }


}
