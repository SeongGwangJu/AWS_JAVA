package ch18_빌더;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
//@Builder

public class KoreaUser {
    private int userId;
    private String username;
    private String password;
    private String name;
    private String email;

    public static KoreaUserBuilder Builder() {
        return new KoreaUserBuilder(); //생성 안해도 호출 가능.
    }

    public static class KoreaUserBuilder {

        private int userId;
        private String username;
        private String password;
        private String name;
        private String email;

        public KoreaUser build() {return new KoreaUser
                (userId, username,
                        password, name, email);
        }

        public KoreaUserBuilder userId(int UserId) {
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
    }


}
