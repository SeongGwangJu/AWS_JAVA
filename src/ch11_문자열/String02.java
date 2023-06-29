package ch11_문자열;

public class String02 {

    public static void main(String[] args) {
        String phone = "010-9988-1916"; //String 객체 생성
        //메서드 써먹을 수 있다.
        int index = phone.indexOf("-");
        System.out.println(index); //3번째 자리에 -가 있다
        int index2 = phone.indexOf("0");
        System.out.println(index2); //문자열의 0번째에 0이 나온다.

        String midNumber = phone.substring(4, 8); //4번째부터 8번째 전까지
        System.out.println(midNumber);

        System.out.println("4,8 지정해주는게 귀찮네\n");
        int firstIndex = phone.indexOf("-");
        int lastIndex = phone.lastIndexOf("-"); //뒤에서 부터 탐색

        System.out.println(firstIndex);
        System.out.println(lastIndex);

        String midNumber2 = phone.substring(firstIndex + 1, lastIndex);
        System.out.println(midNumber2);

        System.out.println("====================");
        boolean findFlag = phone.contains("010"); //"010"을 포함하고 있으면 true로 반환.
        System.out.println(findFlag);
    }
}
