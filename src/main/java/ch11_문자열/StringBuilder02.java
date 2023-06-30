package ch11_문자열;

public class StringBuilder02 {
    public static void main(String[] args) {
        //권한
        String [] roles = {"ROLE_USER", "ROLE_MANAGER", "ROLE_ADMIN"};

        String strRoles = "";
        for(int i = 0; i < roles.length; i++) {
            strRoles += roles[i]; //배열을 String형 으로바꿈
            if(i != roles.length -1) {
                strRoles += ", ";  //각 값 사이를 구분해줌
            }
        }
        System.out.println(strRoles);

        StringBuilder stringRolesBuilder = new StringBuilder();
        for(int i = 0; i < roles.length; i++) {
            stringRolesBuilder.append(roles[i] + ", "); //각각의 배열값 뒤에 "," 추가
        }
        stringRolesBuilder.delete(stringRolesBuilder.lastIndexOf(","), stringRolesBuilder.length());
        //마지막 배열값 뒤에 있는 ", "지움.

        System.out.println(stringRolesBuilder.toString());
    }
}
