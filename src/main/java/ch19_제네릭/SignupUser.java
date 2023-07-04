package ch19_제네릭;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString

public class SignupUser extends AccountUser{
    private  String username;
    private  String password; //AccountUser 클래스를 위해 지움. 만들어서 지움.
    private  String  name;
    private  String email;


}
