package ch18_빌더;
//생성을 효과적으로 하기 위해. 생성자를 쓰지 않고, 빌더라는 녀석이 대신 생성하도록.

import lombok.Data;
@Data
//@Builder

public class KoreaUser {
    private int userId;
    private String username;
    private String password;
    private String name;
    private String email;

    //빌더 생성
    public static KoreaUserBuilder Builder() {
        return new KoreaUserBuilder(); //생성 안해도 호출 가능. 같은 static이니까.
    }

    //No args Cons
    public KoreaUser() {
    }

    //All args Constructor
    public KoreaUser(int userId, String username, String password, String name, String email) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }


    public static class KoreaUserBuilder {

        private int userId;
        private String username;
        private String password;
        private String name;
        private String email;

        public KoreaUser build() {
            return new KoreaUser (userId, username, password, name, email);
        }

        public KoreaUserBuilder userId(int userId) {
            this.userId = userId;
            return this;
        }
        public KoreaUserBuilder username(String  username) {
            this.username = username;
            return this;
        }
        public KoreaUserBuilder password(String  password) {
            this.password = password;
            return this;
        }
        public KoreaUserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public KoreaUserBuilder email(String  email) {
            this.email = email;
            return this;
        }


        //Get Set
        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        //toString

        @Override
        public String toString() {
            return "KoreaUserBuilder{" +
                    "userId=" + userId +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }

    }


}
