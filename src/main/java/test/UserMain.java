package test;
//정답 맞춤
class User {
    private String username;
    private String password;
    private String name;
    private String email;

    public User(String username, String password, String name, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "[사용자정보]" +
                "\nusername='" + username + '\'' +
                "\npassword='" + password + '\'' +
                "\nname='" + name + '\'' +
                "\nemail='" + email + '\'';
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

}

public class UserMain {
    public static void main(String[] args) {
        User user = new User("junil", "1234", "김준일", "junil@gmail.com");
        StringBuilder userInfo = new StringBuilder();
        String varUsername = user.getUsername();
        String varPassword = user.getPassword();
        String varName = user.getName();
        String varEmail = user.getEmail();
        userInfo.append("[사용자 정보]\nusername: " + varUsername +"\npassword: " + varPassword
        +"\nname: " + varName + "\nemail: " + varEmail);
        System.out.println(userInfo);

        System.out.println("\n======정답======\n");
        System.out.println(user);

    }
}
